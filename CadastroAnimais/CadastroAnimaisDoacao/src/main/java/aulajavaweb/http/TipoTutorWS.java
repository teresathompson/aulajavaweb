package aulajavaweb.http;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import aulajavaweb.model.enums.TipoTutor;

@Path("tipotutor")
public class TipoTutorWS {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public TipoTutor[] findAll() {
		return TipoTutor.values();
	}
	
}
