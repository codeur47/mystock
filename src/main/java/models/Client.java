package models;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@NotNull
	private Long idClient;
	
	@NotNull
	private String nom;
	
	@NotNull
	private String prenom;
	
	@NotNull
	private String adresse;
	
	@NotNull
	private String photo;
	
	@NotNull
	private String mail;
	
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> commandeClients;

	

	public Client() {
		super();
	}   
	
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param photo
	 * @param mail
	 */
	public Client(String nom, String prenom, String adresse, String photo, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.photo = photo;
		this.mail = mail;
	}
	
	public Long getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}   
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the commandeClient
	 */
	public List<CommandeClient> getCommandeClient() {
		return commandeClients;
	}

	/**
	 * @param commandeClient the commandeClient to set
	 */
	public void setCommandeClient(List<CommandeClient> commandeClient) {
		this.commandeClients = commandeClient;
	}
   
}
