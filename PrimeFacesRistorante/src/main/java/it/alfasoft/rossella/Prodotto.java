package it.alfasoft.rossella;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.persistence.Embeddable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
@ManagedBean(name="prodotto",eager=true)
public class Prodotto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idProdotto;
	
	private String nome;
	private long prezzo;
	
	
	public Prodotto(String nome, long prezzo) {
		
		
		this.nome = nome;
		this.prezzo = prezzo;
	}


	public Prodotto() {
		
	}


	public long getIdProdotto() {
		return idProdotto;
	}


	public void setIdProdotto(long idProdotto) {
		this.idProdotto = idProdotto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(long prezzo) {
		this.prezzo = prezzo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
