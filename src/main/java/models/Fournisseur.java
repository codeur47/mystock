package models;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Fournisseur
 *
 */
@Entity

public class Fournisseur implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue
	@NotNull
	private Long idFournisseur;
	
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
	
	@OneToMany(mappedBy = "fournisseur")
	private List<CommandeFournisseur> commandeFournisseurs;
	
	public Fournisseur() {
		super();
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param photo
	 * @param mail
	 */
	public Fournisseur(String nom, String prenom, String adresse, String photo, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.photo = photo;
		this.mail = mail;
	}
	public Long getIdFournisseur() {
		return this.idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
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
	 * @return the commandeFournisseurs
	 */
	public List<CommandeFournisseur> getCommandeFournisseurs() {
		return commandeFournisseurs;
	}

	/**
	 * @param commandeFournisseurs the commandeFournisseurs to set
	 */
	public void setCommandeFournisseurs(List<CommandeFournisseur> commandeFournisseurs) {
		this.commandeFournisseurs = commandeFournisseurs;
	}
	
}
