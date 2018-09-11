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
	
	@Column(name="quantite_commandee")
	private Integer quantite_commandee;
	
	@Column(name="quantite_reservee")
	private Integer quantite_reservee;
	
	@OneToOne
	@JoinColumn(name="id_produit")
	private Produit produit;

}
