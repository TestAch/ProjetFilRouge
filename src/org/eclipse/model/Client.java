package org.eclipse.model;

import java.util.Arrays;

public class Client extends Utilisateur {

	private Commande [] commande;
	private Panier panier;


// constructeur :
	
	public Client(int id, String nom, String prenom, String adresseMail, String numeroDeTelephone, String login,
			String motDePasse, Adresse[] adresses, Commande[] commande, Panier panier) {
		super(id, nom, prenom, adresseMail, numeroDeTelephone, login, motDePasse, adresses);
		this.commande = commande;
		this.panier = panier;
	}
	

// getters et setters

	public Commande[] getCommande() {
		return commande;
	}


	public void setCommande(Commande[] commande) {
		this.commande = commande;
	}


	public Panier getPanier() {
		return panier;
	}


	public void setPanier(Panier panier) {
		this.panier = panier;
	}


	
// toString
	

	@Override
	public String toString() {
		return "Client [commande=" + Arrays.toString(commande) + ", panier=" + panier + "]";
	}
	
}
		