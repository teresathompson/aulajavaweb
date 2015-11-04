package aulajavaweb.persistence;

import java.util.Stack;

import javax.persistence.EntityManager;

import org.hibernate.Session;

public class TransactionalContext {

	private static class InternalContext {

		private String pu;
		private Stack<EntityManager> ems = new Stack<EntityManager>();

		public InternalContext(String puName) {
			pu = puName;
		}

		public EntityManager getEntityManager() {
			return ems.peek();
		}

		public void beginTransaction() {
			EntityManager em = PersistenceUnitFactory.createEntityManager(pu);
			em.getTransaction().begin();
			ems.push(em);
		}

		public void commitTransaction() {
			EntityManager em = getEntityManager();
			if(em.getTransaction().isActive()) {
				em.getTransaction().commit();
			}
			closeEntityManager();
		}

		public void rollbackTransaction() {
			EntityManager em = getEntityManager();
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			closeEntityManager();
		}

		@SuppressWarnings("null")
		private void closeEntityManager() {
			EntityManager em = ems.pop();
			if(em != null || em.isOpen()) {
				try {
					Session session = em.unwrap(Session.class);
					session.disconnect();
					em.close();
				} catch(RuntimeException e) {
					e.printStackTrace();
				}
			}
		}

		private void close() {
			if(!ems.isEmpty()) {
				do {
					closeEntityManager();
				} while(!ems.isEmpty());
			}
		}

	}

	public static String defaultPersistenceUnit = "FarmboxAgent";

	public static final ThreadLocal<InternalContext> transContext = new ThreadLocal<InternalContext>();

	public static EntityManager getEntityManager() {
		return transContext.get().getEntityManager();
	}

	public static void open() {
		open(defaultPersistenceUnit);
	}

	public static void open(String puName) {
		transContext.set(new InternalContext(puName));
	}

	public static void close() {
		transContext.get().close();
		transContext.remove();
	}

	public static void beginTransaction() {
		if(!isOpen()) {
			open();
		}
		transContext.get().beginTransaction();
	}

	public static void commitTransaction() {
		transContext.get().commitTransaction();
	}

	public static void rollbackTransaction() {
		InternalContext internalContext = transContext.get();
		if(internalContext != null)
			transContext.get().rollbackTransaction();
	}

	public static boolean isOpen() {
		return transContext.get() != null;
	}

	public static void openAndInit(String puName) {
		open(puName);
		PersistenceUnitFactory.createEntityManager(puName);
	}

	public static void commitAndBegin() {
		transContext.get().commitTransaction();
		transContext.get().beginTransaction();
	}
	
}