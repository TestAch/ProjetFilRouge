package org.eclipse.model;

public class ListeProduits {
	private int idproduit; 
	private int quantite;

	

// constructeur : 
	
	public ListeProduits(int idproduit, int quantite) {
		super();
		this.idproduit = idproduit;
		this.quantite = quantite;
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



	
// toString : 
	
	
	@Override
	public String toString() {
		return "ListeProduits [idproduit=" + idproduit + ", quantite=" + quantite + "]";
	}
	
	
	
}
