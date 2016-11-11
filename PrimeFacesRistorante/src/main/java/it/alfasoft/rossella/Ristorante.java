package it.alfasoft.rossella;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ManagedBean(name="ristorante",eager=true)
public class Ristorante implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idRist;
	
	private String nome;
	
	@ElementCollection
	private Set<Prodotto> primi = new HashSet<Prodotto>();

	@ElementCollection
	private Set<Prodotto> secondi = new HashSet<Prodotto>();
	
	@ElementCollection
	private Set<Prodotto> bevande = new HashSet<Prodotto>();
	
	@ElementCollection
	private Set<Prodotto> dessert = new HashSet<Prodotto>();
	
	
	
	
	public void addProdottoPrimi(Prodotto p){
		primi.add(p);
	}
	public void addProdottoSecondi(Prodotto p){
		primi.add(p);
	}
	public void addProdottoBevande(Prodotto p){
		primi.add(p);
	}
	public void addProdottoDessert(Prodotto p){
		primi.add(p);
	}
	
	
	public Ristorante() {
		
	}

	public long getIdRist() {
		return idRist;
	}

	public void setIdRist(long idRist) {
		this.idRist = idRist;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Prodotto> getPrimi() {
		return primi;
	}

	public void setPrimi(Set<Prodotto> primi) {
		this.primi = primi;
	}

	public Set<Prodotto> getSecondi() {
		return secondi;
	}

	public void setSecondi(Set<Prodotto> secondi) {
		this.secondi = secondi;
	}

	public Set<Prodotto> getBevande() {
		return bevande;
	}

	public void setBevande(Set<Prodotto> bevande) {
		this.bevande = bevande;
	}

	public Set<Prodotto> getDessert() {
		return dessert;
	}

	public void setDessert(Set<Prodotto> dessert) {
		this.dessert = dessert;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	

}
