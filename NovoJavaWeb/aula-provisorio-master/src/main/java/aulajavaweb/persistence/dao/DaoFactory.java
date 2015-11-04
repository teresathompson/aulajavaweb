package aulajavaweb.persistence.dao;

import java.util.HashMap;

import aulajavaweb.model.Model;

public class DaoFactory {

	private static final HashMap<Class<DaoImpl<Model>>, DaoImpl<Model>> daos = new HashMap<>();
	
	private static void singleton(Class<DaoImpl<Model>> clazz) 
			throws InstantiationException, IllegalAccessException {
		if(daos.get(clazz) == null) {
			daos.put(clazz, clazz.newInstance()); 
		}
	}
	
	public static DaoImpl<Model> factory(Class<DaoImpl<Model>> clazz) 
			throws InstantiationException, IllegalAccessException {
		singleton(clazz);
		return daos.get(clazz);
	}
	
}
