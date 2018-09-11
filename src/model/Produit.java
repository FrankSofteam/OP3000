package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Produits")
@Table(name="Produits")
public class Produit {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_produit")
	private Integer id_produit;
	
	@Column(name="nom_produit",length=100)
	private String nom_produit;
	
	@Column(name="tarif_produit")
	private Integer tarif_produit;
	
	
	@Column(name="stock")
	private boolean stock;
	
	@OneToOne
	@JoinColumn(name="id_item")
	private Item item;
	
	public Produit() {
		
	}

	public Integer getId_produit() {
		return id_produit;
	}

	public void setId_produit(Integer id_produit) {
		this.id_produit = id_produit;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}

	public Integer getTarif_produit() {
		return tarif_produit;
	}

	public void setTarif_produit(Integer tarif_produit) {
		this.tarif_produit = tarif_produit;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}


	
}
