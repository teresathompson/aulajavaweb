package aulajavaweb.validator;

import aulajavaweb.model.Animal;

public class AnimalValidator implements Validator<Animal> {

	@Override
	public boolean validate(Animal t) {
		return false;
	}

}
