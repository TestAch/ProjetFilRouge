package org.eclipse.model;

import java.util.Arrays;

public class Client {

	private int id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private Commande [] commande;
	private Adresse adresse;
	private Panier panier;

	
	
// contructeur
	
	public Client(int id, String nom, String prenom, String login, String password, Commande[] commande, Adresse adresse,
			Panier panier) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.commande = commande;
		this.adresse = adresse;
		this.panier = panier;
	}
	
	
	
	

// getters et setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Commande[] getCommande() {
		return commande;
	}
	public void setCommande(Commande[] commande) {
		this.commande = commande;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
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
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + ", commande=" + Arrays.toString(commande) + ", adresse=" + adresse + ", panier=" + panier
				+ "]";
	}	
	
	
}
		