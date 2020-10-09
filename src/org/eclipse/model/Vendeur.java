package org.eclipse.model;

import java.util.Arrays;

public class Vendeur extends Utilisateur {

	private Produit [] produits;

	

// constructeur : 

	
	public Vendeur(int id, String nom, String prenom, String adresseMail, String numeroDeTelephone, String login,
			String motDePasse, Adresse[] adresses, Produit[] produits) {
		super(id, nom, prenom, adresseMail, numeroDeTelephone, login, motDePasse, adresses);
		this.produits = produits;
	}

	
	
// getters et setters : 
	
	public Produit[] getProduits() {
		return produits;
	}



	public void setProduits(Produit[] produits) {
		this.produits = produits;
	}



// toString : 
	
	@Override
	public String toString() {
		return "Vendeur [produits=" + Arrays.toString(produits) + "]";
	}
	
	
}
