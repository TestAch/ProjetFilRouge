package org.eclipse.service;

import java.util.ArrayList;


import org.eclipse.model.Produit;


public class ProduitService {

	private ArrayList<Produit> produits = new ArrayList<Produit>();

// constructeur :

	public ProduitService() {
		produits.add(new Produit(1, "Smartphone", "description produit", 199, 10, "www.lien1.html"));
		produits.add(new Produit(2, "Mouse", "description produit2", 39, 30, "www.lien2.html"));
		produits.add(new Produit(3, "Oscilloscope", "description produit3", 1299, 5, "www.lien3.html"));
	}

	public ProduitService(ArrayList<Produit> produits) {
		super();
		this.produits = produits;
	}

// getters et setters :

	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}

// methodes :

	public void save(Produit produit) {
		produits.add(produit);
	}
	
	public void remove(Produit produit) {
		produits.remove(produit);
	}
	
	
	// update :
	public void update(Produit produit) {
		for (Produit prod: produits) {
			if (prod.getId() == produit.getId()) {
				prod = produit;
			}
		}
	}
	
	// meilleure m�thode du update ? :
	
	//	public Object update(Produit produit) {
	//        for(Produit produitIndividuel : this.produits) {
	//			if(produitIndividuel.getId() == produit.getId()) {
	//				this.produits.remove(produitIndividuel);
	//				return this.save(produit);				
	//			}
	//		}
	//		return false;		
	//}
		
	//	public void update(int id, Produit produit) {		
	//		for (int i = 0; i < produits.size(); i++) {		
	//			Produit findProduitById = produits.get(i);
	//					if (id == findProduitById.getId()) {		
	//						produits.remove(findProduitById);				
	//						produits.add(produit);		
	//					}
	//		}
	//	}
	
	
	
	// findAll : 
	public ArrayList<Produit> findAll() {
		return produits;
	}
	
	// findById : 
	public Produit findById(int id) {
		for (int i = 0; i < produits.size(); i++) {
			Produit findProduitById = produits.get(i); 
			if (id == findProduitById.getId()) {
				return produits.get(i);
			}
		} return null;
	}
	
	//	public Produit findById(int id) {
	//		for (int i = 0; i < tableauDeProduit.size(); i++) {
	//			Produit findProduitById = tableauDeProduit.get(i);
	//			if (id == findProduitById.getId()) {
	//				return tableauDeProduit.get(i);
	//			}		}
	//		return null;	}
	
	
	
	// produits disponibles : 
	
	//	public Produit disponibilite() {
	//		Produit disponible [];
	
	//		for (int i = 0; i < produits.size(); i++) {
	//			int produitdisponibilite = produits.get(i).getQuantiteEnStock();
	//			if (produitdisponibilite > 0) {
	//				disponible
	//			}
	//		}
	//		return null;
	//	}
	
	
	public ArrayList<Produit> findByQuantiteEnStock() {
		ArrayList<Produit> disponibles = new ArrayList<>();
		for (Produit produit : produits) {
			if (produit.getQuantiteEnStock() > 0) {
				disponibles.add(produit);
			}
		}
		return disponibles;
	}
	
	
// toString	:

	@Override
	public String toString() {
		return "ProduitService [produits=" + produits + "]";
	}

}
