package models;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: CommandeFournisseur
 *
 */
@Entity

public class CommandeFournisseur implements Serializable {

	   
	@Id
	@GeneratedValue
	private Long idCommandeFournisseur;
	
	@NotNull
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idFournisseur")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy = "commandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseur;
	private static final long serialVersionUID = 1L;

	public CommandeFournisseur() {
		super();
	}
	
	/**
	 * @param dateCommande
	 * @param fournisseur
	 */
	public CommandeFournisseur(Date dateCommande, Fournisseur fournisseur) {
		super();
		this.dateCommande = dateCommande;
		this.fournisseur = fournisseur;
	}
	public Long getIdCommandeFournisseur() {
		return this.idCommandeFournisseur;
	}

	public void setIdCommandeFournisseur(Long idCommandeFournisseur) {
		this.idCommandeFournisseur = idCommandeFournisseur;
	}   
	public Date getDateCommande() {
		return this.dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}   
	
	public Fournisseur getFournisseur() {
		return this.fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}   
	public List getLigneCommandeFournisseur() {
		return this.ligneCommandeFournisseur;
	}

	public void setLigneCommandeFournisseur(List ligneCommandeFournisseur) {
		this.ligneCommandeFournisseur = ligneCommandeFournisseur;
	}
   
}
