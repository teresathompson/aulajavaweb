package aulajavaweb.validator;

import aulajavaweb.model.Model;

public interface Validator<T extends Model> {

	boolean validate(T t);
	
}
