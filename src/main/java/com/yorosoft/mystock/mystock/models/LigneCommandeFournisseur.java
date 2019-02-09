package com.yorosoft.mystock.mystock.models;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: LigneCommandeFournisseur
 *
 */
@Entity

public class LigneCommandeFournisseur implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLigneCdeFrs;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;

	public LigneCommandeFournisseur() {
		super();
	}   
	public Long getIdLigneCdeFrs() {
		return this.idLigneCdeFrs;
	}

	public void setIdLigneCdeFrs(Long idLigneCdeFrs) {
		this.idLigneCdeFrs = idLigneCdeFrs;
	}   
	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}   
	public CommandeFournisseur getCommandeFournisseur() {
		return this.commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}
   
}
