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
	
	
		
}
