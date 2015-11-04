package aulajavaweb.persistence.dao;

import java.util.List;

import aulajavaweb.model.Model;

public interface Dao<T extends Model>  {

	void insert(T t);
	
	void delete(Integer t) ;
	
	T find(Integer id);
	
	List<T> findAll();
	
	void update(T t);
	
}
