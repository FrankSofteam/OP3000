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
public class Facture {
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
;

	

/*	@OneToMany
	@JoinColumn(name = "id_utilisateur")
	private Set<Todo> taches;

	public Client( ) {
		this.taches = new HashSet<>();
}

	public Set<Todo> getTaches() {
		return taches;
	}

	public void setTaches(Set<Todo> taches) {
		this.taches = taches;
	}
	
	public void addTaches(Todo t) {
		taches.add(t);
	}
*/	
		
}
