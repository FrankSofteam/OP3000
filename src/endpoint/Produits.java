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
import model.Produit;

@Path("/produits")
public class Produits {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Set<Produit> list() {
		return ProduitDAO.list().collect(Collectors.toSet());
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id_produit}")
	public Produit find(@PathParam("id_produit") Integer identifiant) {
		return ProduitDAO
				.list()
				.filter(pro -> pro.getId_produit() == identifiant)
				.findFirst()
				.get();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Produit create(Produit pro) {
		return ProduitDAO.create(pro);
	}
}
