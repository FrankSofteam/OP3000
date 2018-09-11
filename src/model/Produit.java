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
	private Integer id;
	@Column(name="nom_produit",length=100)
	private String nom;
	
	@Column(name="tarif_produit")
	private Integer tarif;
	
	@Column(name="periodicite_produit")
	private String periodicite;
	
	@Column(name="stock_produit")
	private boolean stock;
	
	@OneToOne
	@JoinColumn(name="id_item")
	private Item item;
	
	public Produit() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getTarif() {
		return tarif;
	}

	public void setTarif(Integer tarif) {
		this.tarif = tarif;
	}

	public String getPeriodicite() {
		return periodicite;
	}

	public void setPeriodicite(String periodicite) {
		this.periodicite = periodicite;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
}
