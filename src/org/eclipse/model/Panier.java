package org.eclipse.model;

import java.util.Arrays;

public class Panier {
	private int id;
	private Client client;
	private ListeProduits [] listeProduits;

	

// constructeur
	


	public Panier(int id, Client client, ListeProduits[] listeProduits) {
		super();
		this.id = id;
		this.client = client;
		this.listeProduits = listeProduits;
	}
	

// setters et getters : 
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
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
		return "Panier [id=" + id + ", client=" + client + ", listeProduits=" + Arrays.toString(listeProduits) + "]";
	}	


}
