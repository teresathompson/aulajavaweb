package aulajavaweb.http;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import aulajavaweb.model.enums.Especie;

@Path("especie")
public class EspecieWS {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Especie[] findAll() {
		return Especie.values();
	}
	
}
