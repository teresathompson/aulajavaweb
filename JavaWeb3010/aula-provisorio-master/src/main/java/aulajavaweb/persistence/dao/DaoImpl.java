package aulajavaweb.persistence.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import aulajavaweb.model.Model;
import aulajavaweb.persistence.TransactionalContext;

public abstract class DaoImpl<T extends Model> implements Dao<T> {
	
	private Class<T> clazz;
	
	public DaoImpl(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	public T find(T t) {
		return find(t.getId());
	}
	
	@Override
	public T find(Integer id) {
		String jpql = "from " + clazz.getSimpleName() + " t where t.address = :id";
		TypedQuery<T> q = getManager().createQuery(jpql, clazz);
		q.setParameter("id", id);
		try {
			return q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public List<T> findAll() {
		String jpql = "from " + clazz.getSimpleName();
		EntityManager em = TransactionalContext.getEntityManager();
		TypedQuery<T> q = em.createQuery(jpql, clazz);
		return q.getResultList();
	}
	
	public List<T> findWithRange(Integer start, Integer max) {
		String jpql = "from " + clazz.getSimpleName();
		EntityManager em = TransactionalContext.getEntityManager();
		TypedQuery<T> q = em.createQuery(jpql, clazz);
		q.setFirstResult(start);
		q.setMaxResults(max);
		return q.getResultList();
	}
		
	@Override
	public void insert(T t) {		
		EntityManager em = TransactionalContext.getEntityManager();
		if(t.getId() == null || t.getId() == 0) {
			em.persist(t);
		}
	}

	@Override
	public void update(T t) {
		if(t.getId() != null && t.getId() > 0) {
			getManager().merge(t);
		}
	}

	public void delete(T t) {
		delete(t.getId());
	}
	
	@Override
	public void delete(Integer id) {
		String jpql = "delete from " + clazz.getSimpleName() + " where id = :id";
		TypedQuery<T> q = getManager().createQuery(jpql, clazz);
		q.setParameter("id", id).executeUpdate();
	}

	private EntityManager getManager() {
		return TransactionalContext.getEntityManager();
	}
	
}
