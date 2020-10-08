package org.eclipse.model;

import java.util.Arrays;
import java.util.Date;

public class Commande {
	private int id;
	private Date dateCommande;
	private Client client;
	private LigneCommande [] lignesCommande;

	

// constructeur : 
		
	public Commande(int id, Date dateCommande, Client client, LigneCommande[] lignesCommande) {
		super();
		this.id = id;
		this.dateCommande = dateCommande;
		this.client = client;
		this.lignesCommande = lignesCommande;
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



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}



	public LigneCommande[] getLignesCommande() {
		return lignesCommande;
	}



	public void setLignesCommande(LigneCommande[] lignesCommande) {
		this.lignesCommande = lignesCommande;
	}



	
// toString : 
	

	@Override
	public String toString() {
		return "Commande [id=" + id + ", dateCommande=" + dateCommande + ", client=" + client + ", lignesCommande="
				+ Arrays.toString(lignesCommande) + "]";
	}

	
}
