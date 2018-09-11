package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Stocks")
@Table(name="Stocks")
public class Stock {
	@Column(name="quantite_dispo")
	private Integer quantite_dispo;
	
	@Column(name="quantite_commander")
	private Integer quantite_commander;
	
	@Column(name="Quantite_reserver")
	private Integer quantite_reserver;
	
	@OneToOne
	@JoinColumn(name="id_produit")
	private Produit produit;

}
