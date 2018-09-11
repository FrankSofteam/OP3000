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
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity(name="Factures")
@Table(name="Factures")
public class Facture {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_facture")
	private Integer id_facture;
		
	@Column(name="date_facture")
	private Date date_facture;

	@Column(name="total_ht",length = 10)
	private Float total_ht;

	
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

	@OneToOne
	@JoinColumn(name = "id_abonnement")
	private Abonnement abonnement;

	
	public Facture() {
	}


	public Integer getId_facture() {
		return id_facture;
	}


	public void setId_facture(Integer id_facture) {
		this.id_facture = id_facture;
	}


	public Date getDate_facture() {
		return date_facture;
	}


	public void setDate_facture(Date date_facture) {
		this.date_facture = date_facture;
	}


	public Float getTotal_ht() {
		return total_ht;
	}


	public void setTotal_ht(Float total_ht) {
		this.total_ht = total_ht;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Abonnement getAbonnement() {
		return abonnement;
	}


	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}

	
	
	
		
}
