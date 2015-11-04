package aulajavaweb.persistence;

import java.util.Hashtable;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUnitFactory {

	private static Map<String, EntityManagerFactory> emfMap = new Hashtable<>(); 

	public static EntityManager createEntityManager(String puName) {
		return getEntityManagerFactory(puName).createEntityManager();
	}

	public synchronized static void destroyEntityManagerFactory() {
		for (EntityManagerFactory emf : emfMap.values()) {
    		emf.close();
    	}
		emfMap.clear();
    }

    public synchronized static EntityManagerFactory getEntityManagerFactory(String puName) {
    	EntityManagerFactory emf = emfMap.get(puName);
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory(puName);
			emfMap.put(puName, emf);
		}
		return emf;
	}
}