package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.ListeProduit;



public class ListeProduitService {

	private ArrayList<ListeProduit> listeProduits;


	
// constructeur : 
	
	public ListeProduitService() {
		listeProduits = new ArrayList<ListeProduit>();
	}
	
	
	public ListeProduitService(ArrayList<ListeProduit> listeProduits) {
		super();
		this.listeProduits = listeProduits;
	}



	
	
// getters et setters : 
	
	public ArrayList<ListeProduit> getListeProduits() {
		return listeProduits;
	}


	public void setListeProduits(ArrayList<ListeProduit> listeProduits) {
		this.listeProduits = listeProduits;
	}


	
// methodes : 
	
	
	public void save(ListeProduit listeProduit) {
		listeProduits.add(listeProduit);
	}
	
	public void remove(ListeProduit listeProduit) {
		listeProduits.remove(listeProduit);
	}

	// update :
	public void update(ListeProduit listeProduit) {
		for (ListeProduit listeP: listeProduits) {
			if (listeP.getIdproduit() == listeProduit.getIdproduit()) {
				listeP = listeProduit;
			}
		}
	}

	// findAll : 
	public ArrayList<ListeProduit> findAll() {
		return listeProduits;
	}
	
	// findById : 
	public ListeProduit findById(int id) {
		for (int i = 0; i < listeProduits.size(); i++) {
			ListeProduit findListeProduitById = listeProduits.get(i); 
			if (id == findListeProduitById.getIdproduit()) {
				return listeProduits.get(i);
			}
		} return null;
	}
	
	
	
	
	
// toString : 
	

	@Override
	public String toString() {
		return "ListeProduitService [listeProduits=" + listeProduits + "]";
	}
		
	
}
