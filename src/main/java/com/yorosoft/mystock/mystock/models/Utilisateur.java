package com.yorosoft.mystock.mystock.models;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Utilisateur
 *
 */
@Entity

public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUtilisateur;
	
	@NotNull
	private String nom;
	
	@NotNull
	private String prenom;
	
	@NotNull
	private String mail;
	
	@NotNull
	private String motDePasse;
	
	@NotNull
	private String photo;

	public Utilisateur() {
		super();
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param motDePasse
	 * @param photo
	 */
	public Utilisateur(String nom, String prenom, String mail, String motDePasse, String photo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.motDePasse = motDePasse;
		this.photo = photo;
	}
	public Long getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}   
	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}   
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
   
}
