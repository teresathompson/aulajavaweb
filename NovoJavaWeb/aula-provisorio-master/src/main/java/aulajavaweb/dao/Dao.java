package aulajavaweb.dao;

import aulajavaweb.model.Model;

public interface Dao<T extends Model>  {

	void insert(T t);
	
	void delete(T t) ;
	
	T find(Integer id);
	
	void update(T t);
	
}
