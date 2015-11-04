

package aulajavaweb.http;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import aulajavaweb.model.Endereco;



@Path("endereco")
public class EnderecoWS {

	@POST
	@Path("insert")
	@Consumes({MediaType.APPLICATION_JSON})
	public void insert(Endereco endereco) {

	}
	
	@GET
	@Path("find/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Endereco find(@PathParam("id") Integer id) {
		return null;
	}
	
	@GET
	@Path("find/nome{nome}")
	@Produces({MediaType.APPLICATION_JSON})
	public Endereco find(@PathParam("nome") String nome){
		return null;
	}
	
	@DELETE
	@Path("delete/{id}")
	public void delete(@PathParam("id") Integer id){
		
	}
	
	
	
	@POST
	@Path("update")
	@Consumes({MediaType.APPLICATION_JSON})
	public void update(Endereco endereco){
		
	}
	
	}

