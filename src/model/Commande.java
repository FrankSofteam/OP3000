package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity(name="Commandes")
@Table(name="Commandes")
public class Commande {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_commande")
	private Integer id_commande;
		
	@Column(name="date_commande")
	private Date date_commande;

	@Column(name="total_ht",length = 10)
	private Float total_ht;

	@Column(name="remise")
	private Integer remise;

	@Column(name="date_fin")
	private Date date_fin;
	
	
	
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	

	
	public Commande() {
	}


	public Integer getId_commande() {
		return id_commande;
	}


	public void setId_commande(Integer id_commande) {
		this.id_commande = id_commande;
	}


	public Date getDate_commande() {
		return date_commande;
	}


	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}


	public Float getTotal_ht() {
		return total_ht;
	}


	public void setTotal_ht(Float total_ht) {
		this.total_ht = total_ht;
	}


	public Integer getRemise() {
		return remise;
	}


	public void setRemise(Integer remise) {
		this.remise = remise;
	}


	public Date getDate_fin() {
		return date_fin;
	}


	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	
}
