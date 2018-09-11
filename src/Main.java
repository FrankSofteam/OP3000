import org.hibernate.Session;

import dao.UserDAO;
import helpers.HibernateHelper;
import model.Todo;
import model.Client;

public class Main {
public static void main(String[] args) {
	

	Produit pro = new Produit();
	clt.setNom_produit("Forfait 2h00 4G/4G+");
	clt.setTarif_produit("3");
	
	Produit pro1 = new Produit();
	clt.setNom_produit("Forfait illimité 4G/4G+ 10Go");
	clt.setTarif_produit("10");
	
	Produit pro2 = new Produit();
	clt.setNom_produit("Forfait illimité 4G/4G+ 100Go");
	clt.setTarif_produit("25");
	
	Produit pro3 = new Produit();
	clt.setNom_produit("Box ADSL 100 Mbit/s");
	clt.setTarif_produit("30");

	Produit pro4 = new Produit();
	clt.setNom_produit("Box Fibre 500 Mbit/s");
	clt.setTarif_produit("50");
	
	Produit pro5 = new Produit();
	clt.setNom_produit("Bouquet TV de base");
	clt.setTarif_produit("0");
	
	Produit pro6 = new Produit();
	clt.setNom_produit("Bouquet TV Bronze : Ciné & Séries");	
	clt.setTarif_produit("10");
	
	Produit pro7 = new Produit();
	clt.setNom_produit("Bouquet TV Argent : Famille");
	clt.setTarif_produit("10");
	
	Produit pro8 = new Produit();
	clt.setNom_produit("Bouquet TV Or : Sport");
	clt.setTarif_produit("10");
	

	
	
	Todo t = new Todo();
	t.setDescription("Ranger tout");
	
/*	u.addTaches(t);
	UserDAO.create(u):
		UserDAO.list().forEach(System.out::println);
		*/
}
}
