package aulajavaweb.http;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import aulajavaweb.model.enums.Estado;

@Path("estado")
public class EstadoWS {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Estado[] findAll() {
		return Estado.values();
	}
	
}



