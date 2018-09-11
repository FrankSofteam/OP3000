package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="Taches")
@Table(name="Taches")
public class Todo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_tache")
	private Integer id;
	
	@Column(name="description")
	private String description;
	
    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    @JsonIgnore
    private Client u;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getU() {
		return u;
	}

	public void setU(Client u) {
		this.u = u;
	}

	public Todo() {
    	
    }

    // Tous les POJO :
    // Contrôleur par défaut
    // Getters / Setters
    // Attributs privés
    
    // DAO : Classe utilitaire qui encapsule Hibernate
    

}
