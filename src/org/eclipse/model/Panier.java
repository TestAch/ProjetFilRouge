package org.eclipse.model;

import java.util.Arrays;

public class Panier {
	private Client client;
	private Produit [] produits;
	private ListeProduits [] listeProduits;

	

// constructeur
	
	public Panier(Client client, Produit[] produits, ListeProduits[] listeProduits) {
		super();
		this.client = client;
		this.produits = produits;
		this.listeProduits = listeProduits;
	}
	


// setters et getters : 
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Produit[] getProduits() {
		return produits;
	}
	public void setProduits(Produit[] produits) {
		this.produits = produits;
	}
	public ListeProduits[] getListeProduits() {
		return listeProduits;
	}
	public void setListeProduits(ListeProduits[] listeProduits) {
		this.listeProduits = listeProduits;
	}



	
// toString : 
	
	@Override
	public String toString() {
		return "Panier [client=" + client + ", produits=" + Arrays.toString(produits) + ", listeProduits="
				+ Arrays.toString(listeProduits) + "]";
	}	
	


}
