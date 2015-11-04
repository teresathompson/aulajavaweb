package aulajavaweb.service;

import aulajavaweb.model.AnimalVacina;
import aulajavaweb.persistence.dao.AnimalVacinaDao;
import aulajavaweb.validator.AnimalVacinaValidator;

public class AnimalVacinaService extends Service<AnimalVacina, 
		AnimalVacinaValidator, AnimalVacinaDao> {

	public AnimalVacinaService() 
			throws InstantiationException, IllegalAccessException {
		super(AnimalVacinaValidator.class, AnimalVacinaDao.class);
	}
	
}
