package aulajavaweb.http;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import aulajavaweb.model.Animal;

@Path("animal")
public class AnimalWS {

	@POST
	@Path("insert")
	@Consumes({MediaType.APPLICATION_JSON})
	public void insert(Animal animal) {

	}
	
	@GET
	@Path("find/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Animal find(@PathParam("id") Integer id) {
		return null;
	}
	
	@GET
	@Path("find/nome{nome}")
	@Produces({MediaType.APPLICATION_JSON})
	public Animal find(@PathParam("nome") String nome){
		return null;
	}
	
	@DELETE
	@Path("delete/{id}")
	public void delete(@PathParam("id") Integer id){
		
	}
	
	@GET
	@Path("find/nomes{nomes}")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Animal> findAll(@PathParam("nomes") String nomes){
		return null;
	}
	
	@POST
	@Path("update")
	@Consumes({MediaType.APPLICATION_JSON})
	public void update(Animal animal){
		
	}
	
	}

