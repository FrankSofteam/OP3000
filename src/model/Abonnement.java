package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity(name="Abonnements")
@Table(name="Abonnements")
public class Abonnement {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_abonnement")
	private Integer id_abonnement;
		
	@Column(name="date_facturation")
	private Date date_facturation;

	
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

	@OneToOne
	@JoinColumn(name = "id_item")
	private Item item;
	
	@OneToOne
	@JoinColumn(name = "id_facture")
	private Facture facture;
	
	
	public Abonnement() {
	}


	public Integer getId_abonnement() {
		return id_abonnement;
	}


	public void setId_abonnement(Integer id_abonnement) {
		this.id_abonnement = id_abonnement;
	}


	public Date getDate_facturation() {
		return date_facturation;
	}


	public void setDate_facturation(Date date_facturation) {
		this.date_facturation = date_facturation;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	public Facture getFacture() {
		return facture;
	}


	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	
	
	
	
	
}
