package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Produit;


public class ProduitService {

	private ArrayList<Produit> produits;

// constructeur :

//
	public ProduitService() {
		// TODO Auto-generated constructor stub
		produits = new ArrayList<Produit>();
	}
//

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
	
	public void update(Produit produit) {
		for (Produit prod: produits) {
			if (prod.getId() == produit.getId()) {
				prod = produit;
			}
		}
	}
	
	public ArrayList<Produit> findAll() {
		return produits;
	}
	
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
	
	
	
// toString	:

	@Override
	public String toString() {
		return "ProduitService [produits=" + produits + "]";
	}

}
