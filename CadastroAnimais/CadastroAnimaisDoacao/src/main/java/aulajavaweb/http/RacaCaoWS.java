package aulajavaweb.http;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import aulajavaweb.model.enums.RacaCao;

@Path("racacao")
public class RacaCaoWS {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public RacaCao[] findAll() {
		return RacaCao.values();
	}

}