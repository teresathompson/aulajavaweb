package aulajavaweb.service;

import aulajavaweb.model.Model;
import aulajavaweb.persistence.dao.DaoImpl;
import aulajavaweb.validator.Validator;

public abstract class Service<E extends Model,
							  V extends Validator<E>, 
							  D extends DaoImpl<E>> {

	private V validator;
	private DaoImpl<E> dao;
	
	public Service(Class<V> classV, Class<D> classD) 
			throws InstantiationException, IllegalAccessException {
		validator = classV.newInstance();
		dao = classD.newInstance();
	}
	
	public void insert(E e) {
		if(validator.validate(e)) {
			dao.insert(e);
		}
	}
	
	public E find(Integer id) {
		return dao.find(id);
	}
	
	
}
