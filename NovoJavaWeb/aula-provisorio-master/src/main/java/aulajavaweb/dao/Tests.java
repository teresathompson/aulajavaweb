package aulajavaweb.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import aulajavaweb.model.Animal;
import aulajavaweb.persistence.dao.AnimalDao;

public class Tests {

	public static void main(String[] args) {
		EntityManager em = (EntityManager) Persistence.createEntityManagerFactory("animal-postgres");
		AnimalDao dao = new AnimalDao();
		dao.insert(new Animal());
	}
	
}
