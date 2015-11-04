package aulajavaweb.service;

import aulajavaweb.model.AnimalVermifugo;
import aulajavaweb.persistence.dao.AnimalVermifugoDao;
import aulajavaweb.validator.AnimalVermifugoValidator;

public class AnimalVermifugoService extends Service<AnimalVermifugo, AnimalVermifugoValidator, AnimalVermifugoDao>{

	public AnimalVermifugoService() throws InstantiationException,
			IllegalAccessException {
		super(AnimalVermifugoValidator.class, AnimalVermifugoDao.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
