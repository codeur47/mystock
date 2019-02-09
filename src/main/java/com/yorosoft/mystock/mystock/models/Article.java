package com.yorosoft.mystock.mystock.models;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Article
 *
 */
@Entity
public class Article implements Serializable {

	   
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private Long idArticle;
	
	@NotNull
	private String codeArticle;
	
	@NotNull
	private String designation;
	
	@NotNull
	private BigDecimal prixUnitaireHT;
	
	@NotNull
	private BigDecimal tauxTva;
	
	@NotNull
	private BigDecimal prixUnitaireTTC;
	
	@NotNull
	private String photo;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idCategory")
	private Category category;
	
	public Article() {
		super();
	}
	
	/**
	 * @param codeArticle
	 * @param designation
	 * @param prixUnitaireHT
	 * @param tauxTva
	 * @param prixUnitaireTTC
	 * @param photo
	 */
	public Article(String codeArticle, String designation, BigDecimal prixUnitaireHT, BigDecimal tauxTva,
			BigDecimal prixUnitaireTTC, String photo) {
		super();
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prixUnitaireHT = prixUnitaireHT;
		this.tauxTva = tauxTva;
		this.prixUnitaireTTC = prixUnitaireTTC;
		this.photo = photo;
	}
	
	public Long getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}   
	public String getCodeArticle() {
		return this.codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}   
	
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}   
	public BigDecimal getPrixUnitaireHT() {
		return this.prixUnitaireHT;
	}

	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}   
	public BigDecimal getTauxTva() {
		return this.tauxTva;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}   
	public BigDecimal getPrixUnitaireTTC() {
		return this.prixUnitaireTTC;
	}

	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}   
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}   
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
   
}
