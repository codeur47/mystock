package com.yorosoft.mystock.mystock.models;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: LigneVente
 *
 */
@Entity

public class LigneVente implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLigneVente;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "vente")
	private Vente vente;

	public LigneVente() {
		super();
	}   
	public Long getIdLigneVente() {
		return this.idLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}   
	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
   
}
