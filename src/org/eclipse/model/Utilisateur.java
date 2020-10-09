package org.eclipse.model;

import java.util.Arrays;

public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private String adresseMail;
	private String numeroDeTelephone;
	private String login;
	private String motDePasse;
	private Adresse [] adresses;



// constructeur : 

	
	public Utilisateur(int id, String nom, String prenom, String adresseMail, String numeroDeTelephone, String login,
			String motDePasse, Adresse[] adresses) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
		this.numeroDeTelephone = numeroDeTelephone;
		this.login = login;
		this.motDePasse = motDePasse;
		this.adresses = adresses;
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



	public String getAdresseMail() {
		return adresseMail;
	}



	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}



	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}



	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getMotDePasse() {
		return motDePasse;
	}



	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}



	public Adresse[] getAdresses() {
		return adresses;
	}



	public void setAdresses(Adresse[] adresses) {
		this.adresses = adresses;
	}



	
// toString : 
	
	
	
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresseMail=" + adresseMail
				+ ", numeroDeTelephone=" + numeroDeTelephone + ", login=" + login + ", motDePasse=" + motDePasse
				+ ", adresses=" + Arrays.toString(adresses) + "]";
	}
	
	

}