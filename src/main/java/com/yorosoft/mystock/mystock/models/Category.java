package com.yorosoft.mystock.mystock.models;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity
public class Category implements Serializable {

	   
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private Long idCategory;
	
	@NotNull
	private String code;
	
	@NotNull
	private String designation;
	
	@OneToMany(mappedBy="category")
	private List<Article> articles;

	public Category() {
		super();
	}   
	
	/**
	 * @param code
	 * @param designation
	 */
	public Category(String code, String designation) {
		super();
		this.code = code;
		this.designation = designation;
	}

	public Long getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}   
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}   
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the articles
	 */
	public List<Article> getArticles() {
		return articles;
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
   
}
