package org.eclipse.model;

public class ListeProduit {
	private int idproduit; 
	private int quantite;
	private Panier panier;
	private Produit produit;
	


// constructeur : 
	
	public ListeProduit(int idproduit, int quantite, Panier panier, Produit produit) {
		super();
		this.idproduit = idproduit;
		this.quantite = quantite;
		this.panier = panier;
		this.produit = produit;
	}
	
	
// getters and setters : 
	
	
	public int getIdproduit() {
		return idproduit;
	}


	public void setIdproduit(int idproduit) {
		this.idproduit = idproduit;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public Panier getPanier() {
		return panier;
	}


	public void setPanier(Panier panier) {
		this.panier = panier;
	}


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	
// toString : 
	
	@Override
	public String toString() {
		return "ListeProduit [idproduit=" + idproduit + ", quantite=" + quantite + ", panier=" + panier + ", produit="
				+ produit + "]";
	}

}
