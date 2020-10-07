package org.eclipse.model;

import java.util.Arrays;

public class Vendeur {
	private int id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private Produit [] produits;

	

// constructeur : 
	
	public Vendeur(int id, String nom, String prenom, String login, String password, Produit[] produits) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.produits = produits;
	}
	
	
	
	
// getters et setters : 
	
	
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
	public Produit[] getProduits() {
		return produits;
	}
	public void setProduits(Produit[] produits) {
		this.produits = produits;
	}


	
	
// toString : 
	
	
	@Override
	public String toString() {
		return "Vendeur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + ", produits=" + Arrays.toString(produits) + "]";
	}
	
	
	
}
