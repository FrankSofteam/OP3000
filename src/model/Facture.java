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

}
