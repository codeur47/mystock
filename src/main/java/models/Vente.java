package models;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vente
 *
 */
@Entity
public class Vente implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue
	private Long idVente;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente;

	@OneToMany(mappedBy = "vente")
	private List<LigneVente> ligneVentes;
	
	public Vente() {
		super();
	}  
	
	/**
	 * @param code
	 * @param dateVente
	 */
	public Vente(String code, Date dateVente) {
		super();
		this.code = code;
		this.dateVente = dateVente;
	}
	public Long getIdVente() {
		return this.idVente;
	}

	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}   
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}   
	
	public Date getDateVente() {
		return this.dateVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}
   
}
