import org.hibernate.Session;

import dao.ProduitDAO;
import helpers.HibernateHelper;
import model.Client;
import model.Produit;

public class Main {
public static void main(String[] args) {
	

	Produit pro = new Produit();
	pro.setNom_produit("Forfait 2h00 4G/4G+");
	pro.setTarif_produit(3);
	
	Produit pro1 = new Produit();
	pro.setNom_produit("Forfait illimité 4G/4G+ 10Go");
	pro.setTarif_produit(10);
	
	Produit pro2 = new Produit();
	pro.setNom_produit("Forfait illimité 4G/4G+ 100Go");
	pro.setTarif_produit(25);
	
	Produit pro3 = new Produit();
	pro.setNom_produit("Box ADSL 100 Mbit/s");
	pro.setTarif_produit(30);

	Produit pro4 = new Produit();
	pro.setNom_produit("Box Fibre 500 Mbit/s");
	pro.setTarif_produit(50);
	
	Produit pro5 = new Produit();
	pro.setNom_produit("Bouquet TV de base");
	pro.setTarif_produit(0);
	
	Produit pro6 = new Produit();
	pro.setNom_produit("Bouquet TV Bronze : Ciné & Séries");	
	pro.setTarif_produit(10);
	
	Produit pro7 = new Produit();
	pro.setNom_produit("Bouquet TV Argent : Famille");
	pro.setTarif_produit(10);
	
	Produit pro8 = new Produit();
	pro.setNom_produit("Bouquet TV Or : Sport");
	pro.setTarif_produit(10);
	
	ProduitDAO.create(pro8);
	ProduitDAO.list().forEach(System.out::println);
	

	
/*	u.addTaches(t);
	UserDAO.create(u):
		UserDAO.list().forEach(System.out::println);
		*/
}
}
