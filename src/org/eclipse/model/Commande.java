package org.eclipse.model;

import java.util.Arrays;
import java.util.Date;

public class Commande {
	private int id;
	private Date dateCommande;
	private float totalCommande;
	private Produit [] produit;
	private Client client;

	

// constructeur : 
	
	
	public Commande(int id, Date dateCommande, float totalCommande, Produit[] produit, Client client) {
		super();
		this.id = id;
		this.dateCommande = dateCommande;
		this.totalCommande = totalCommande;
		this.produit = produit;
		this.client = client;
	}
	
	
	

	
	
// getters et setters : 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public float getTotalCommande() {
		return totalCommande;
	}
	public void setTotalCommande(float totalCommande) {
		this.totalCommande = totalCommande;
	}
	public Produit[] getProduit() {
		return produit;
	}
	public void setProduit(Produit[] produit) {
		this.produit = produit;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}




	
	
// toString : 
	
	
	@Override
	public String toString() {
		return "Commande [id=" + id + ", dateCommande=" + dateCommande + ", totalCommande=" + totalCommande
				+ ", produit=" + Arrays.toString(produit) + ", client=" + client + "]";
	}
	
	
	
	
}
