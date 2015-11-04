package aulajavaweb.http;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import aulajavaweb.model.enums.Temperamento;


@Path("temperamento")
public class TemperamentoWS {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Temperamento[] findAll() {
		return Temperamento.values();
	}

}
