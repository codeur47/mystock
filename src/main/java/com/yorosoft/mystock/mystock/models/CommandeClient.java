package com.yorosoft.mystock.mystock.models;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: CommandeClient
 *
 */
@Entity

public class CommandeClient implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCommandeClient;
	
	@NotNull
	private String code;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCommandeClient> ligneCommandeClients;

	
	public CommandeClient() {
		super();
	}   
	public Long getIdCommandeClient() {
		return this.idCommandeClient;
	}

	public void setIdCommandeClient(Long idCommandeClient) {
		this.idCommandeClient = idCommandeClient;
	}   
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}   
	public Date getDateCommande() {
		return this.dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}   
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}   
	public List getLigneCommandeClients() {
		return this.ligneCommandeClients;
	}

	public void setLigneCommandeClients(List ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}
	
   
}
