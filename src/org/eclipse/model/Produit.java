package org.eclipse.model;

import java.util.Arrays;

public class Produit {
	private int id;
	private String nomArticle;
	private String designation;
	private float prixUnitaire;
	private int quantiteEnStock;
	private String url;
	private String categorie;
	private Vendeur [] vendeur;
	private Commande [] commande;
	private Panier [] panier;

	

// constructeur : 
	
	
	public Produit(int id, String nomArticle, String designation, float prixUnitaire, int quantiteEnStock, String url,
			String categorie, Vendeur[] vendeur, Commande[] commande, Panier[] panier) {
		super();
		this.id = id;
		this.nomArticle = nomArticle;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantiteEnStock = quantiteEnStock;
		this.url = url;
		this.categorie = categorie;
		this.vendeur = vendeur;
		this.commande = commande;
		this.panier = panier;
	}
	
	
	
	
	
// setters et getters : 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public int getQuantiteEnStock() {
		return quantiteEnStock;
	}
	public void setQuantiteEnStock(int quantiteEnStock) {
		this.quantiteEnStock = quantiteEnStock;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Vendeur[] getVendeur() {
		return vendeur;
	}
	public void setVendeur(Vendeur[] vendeur) {
		this.vendeur = vendeur;
	}
	public Commande[] getCommande() {
		return commande;
	}
	public void setCommande(Commande[] commande) {
		this.commande = commande;
	}
	public Panier[] getPanier() {
		return panier;
	}
	public void setPanier(Panier[] panier) {
		this.panier = panier;
	}


	
	
// toString : 
	
	

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nomArticle=" + nomArticle + ", designation=" + designation + ", prixUnitaire="
				+ prixUnitaire + ", quantiteEnStock=" + quantiteEnStock + ", url=" + url + ", categorie=" + categorie
				+ ", vendeur=" + Arrays.toString(vendeur) + ", commande=" + Arrays.toString(commande) + ", panier="
				+ Arrays.toString(panier) + "]";
	}
	
	
	
}
