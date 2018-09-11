package endpoint;

import java.util.Set;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.ProduitDAO;
import model.Todo;

@Path("/todos")
public class Todos {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Set<Todo> list() {
		return ProduitDAO.list().collect(Collectors.toSet());
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Todo find(@PathParam("id") Integer identifiant) {
		return ProduitDAO
				.list()
				.filter(t -> t.getId() == identifiant)
				.findFirst()
				.get();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Todo create(Todo t) {
		return ProduitDAO.create(t);
	}
}
