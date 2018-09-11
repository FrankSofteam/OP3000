package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Items")
@Table(name="Items")
public class Item {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_item")
	private Integer id;
	
	@Column(name="date_debut")
	private Date date_debut;
	
	@Column(name="date_fin")
	private Date date_fin;
	
	
	
}
