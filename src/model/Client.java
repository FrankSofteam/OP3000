package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name="Clients")
@Table(name="Clients")
public class Client {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_client")
	private Integer id_client;

	@Column(name="nom",length = 50)
	private String nom;

	@Column(name="prenom",length = 50)
	private String prenom;

	@Column(name="adresse1",length = 100)
	private String adresse1;
	
	@Column(name="adresse2",length = 100)
	private String adresse2;
	
	@Column(name="code_postal",length = 5)
	private String code_postal;
	
	@Column(name="ville",length =50)
	private String ville;

	@Column(name="tel_fixe",length =10)
	private String tel_fixe;
	
	@Column(name="tel_mobile",length =50)
	private String tel_mobile;

	@Column(name="email",length =50)
	private String email;
	
	@Column(name="password",length =20)
	private String password;
		
	@Column(name="iban",length =27)
	private String iban;
	
	@Column(name="date_paiement")
	private Date date_paiement;
	
	public Client() {
		
	}

	public Integer getId_client() {
		return id_client;
	}

	public void setId_clientid(Integer id_client) {
		this.id_client = id_client;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse1() {
		return adresse1;
	}

	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	public String getAdresse2() {
		return adresse2;
	}

	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTel_fixe() {
		return tel_fixe;
	}

	public void setTel_fixe(String tel_fixe) {
		this.tel_fixe = tel_fixe;
	}

	public String getTel_mobile() {
		return tel_mobile;
	}

	public void setTel_mobile(String tel_mobile) {
		this.tel_mobile = tel_mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Date getDate_paiement() {
		return date_paiement;
	}

	public void setDate_paiement(Date date_paiement) {
		this.date_paiement = date_paiement;
	}
	
	
	
	

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
