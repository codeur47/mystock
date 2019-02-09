package models;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: LigneCommandeClient
 *
 */
@Entity

public class LigneCommandeClient implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue
	private Long idLigneCdeClt;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeClient")
	private CommandeClient commandeClient;

	public LigneCommandeClient() {
		super();
	}   
	public Long getIdLigneCdeClt() {
		return this.idLigneCdeClt;
	}

	public void setIdLigneCdeClt(Long idLigneCdeClt) {
		this.idLigneCdeClt = idLigneCdeClt;
	}   
	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}   
	public CommandeClient getCommandeClient() {
		return this.commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}
   
}
