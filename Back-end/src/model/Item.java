package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Items")
@Table(name="Items")
public class Item {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_item")
	private Integer id_item;
	
	@Column(name="date_debut")
	private Date date_debut;
	
	@Column(name="date_fin")
	private Date date_fin;
	
	@OneToOne
	@JoinColumn(name="id_produit")
	private Produit produit;
	
	@OneToOne
	@JoinColumn(name="id_abonnement")
	private Abonnement abonnement;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_commande")
	private Commande commande;
	
	public Item() {
		
	}


	public Integer getId_item() {
		return id_item;
	}



	public void setId_item(Integer id_item) {
		this.id_item = id_item;
	}



	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	
}
