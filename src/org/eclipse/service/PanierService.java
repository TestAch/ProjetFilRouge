package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Panier;



public class PanierService {

	private ArrayList<Panier> paniers;


	
// constructeur :
	
	public PanierService() {
		paniers = new ArrayList<Panier>();
	}
	
	
	public PanierService(ArrayList<Panier> paniers) {
		super();
		this.paniers = paniers;
	}




	
// getters and setters :
	
	public ArrayList<Panier> getPaniers() {
		return paniers;
	}


	public void setPaniers(ArrayList<Panier> paniers) {
		this.paniers = paniers;
	}



	
// methodes : 	
	
	
	public void save(Panier panier) {
		paniers.add(panier);
	}
	
	public void remove(Panier panier) {
		paniers.remove(panier);
	}

	// update :
	public void update(Panier panier) {
		for (Panier pani: paniers) {
			if (pani.getId() == panier.getId()) {
				pani = panier;
			}
		}
	}

	// findAll : 
	public ArrayList<Panier> findAll() {
		return paniers;
	}
	
	// findById : 
	public Panier findById(int id) {
		for (int i = 0; i < paniers.size(); i++) {
			Panier findPanierById = paniers.get(i); 
			if (id == findPanierById.getId()) {
				return paniers.get(i);
			}
		} return null;
	}
	
	
	
// toString : 	
	
	@Override
	public String toString() {
		return "PanierService [paniers=" + paniers + "]";
	}
	
		
	
}
