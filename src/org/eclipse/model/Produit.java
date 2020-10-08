package org.eclipse.model;


public class Produit {
	private int id;
	private String nomArticle;
	private String designation;
	private double prixUnitaire;
	private int quantiteEnStock;
	private String url;



// constructeur : 
	

	public Produit(int id, String nomArticle, String designation, double prixUnitaire, int quantiteEnStock, String url) {
		super();
		this.id = id;
		this.nomArticle = nomArticle;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantiteEnStock = quantiteEnStock;
		this.url = url;
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


	public double getPrixUnitaire() {
		return prixUnitaire;
	}


	public void setPrixUnitaire(double prixUnitaire) {
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




// toString : 
	
	@Override
	public String toString() {
		return "Produit [id=" + id + ", nomArticle=" + nomArticle + ", designation=" + designation + ", prixUnitaire="
				+ prixUnitaire + ", quantiteEnStock=" + quantiteEnStock + ", url=" + url + "]";
	}


}
