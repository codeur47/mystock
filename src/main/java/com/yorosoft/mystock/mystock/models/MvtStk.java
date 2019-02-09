package com.yorosoft.mystock.mystock.models;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: MvtStk
 *
 */
@Entity

public class MvtStk implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final int ENTREE = 1;
	public static final int SORTIE = 2;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMvtStk;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
		
	private BigDecimal quantite;
	
	private int typeMvt;

	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	
	public MvtStk() {
		super();
	}   
	public Long getIdMvtStk() {
		return this.idMvtStk;
	}

	public void setIdMvtStk(Long idMvtStk) {
		this.idMvtStk = idMvtStk;
	}   
	public Date getDateMvt() {
		return this.dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}   
	public BigDecimal getQuantite() {
		return this.quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}   
	public int getTypeMvt() {
		return this.typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}
	/**
	 * @return the article
	 */
	public Article getArticle() {
		return article;
	}
	/**
	 * @param article the article to set
	 */
	public void setArticle(Article article) {
		this.article = article;
	}
   
}
