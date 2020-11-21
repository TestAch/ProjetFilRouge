package org.eclipse.model;



public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private String adresseMail;
	private String numeroDeTelephone;
	private String login;
	private String motDePasse;
	private String adresse;
	private String type;



// constructeur : 

	
	public Utilisateur(int id, String nom, String prenom, String adresseMail, String numeroDeTelephone, String login,
			String motDePasse, String adresse, String type) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
		this.numeroDeTelephone = numeroDeTelephone;
		this.login = login;
		this.motDePasse = motDePasse;
		this.adresse = adresse;
		this.type = type;
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



	public String getAdresse() {
		return adresse;
	}



	public void setAdresses(String adresse) {
		this.adresse = adresse;
	}
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}





	
// toString : 
	
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresseMail=" + adresseMail
				+ ", numeroDeTelephone=" + numeroDeTelephone + ", login=" + login + ", motDePasse=" + motDePasse
				+ ", adresse=" + adresse + ", type=" + type + "]";
	}




	

}