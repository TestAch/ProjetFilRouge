package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Vendeur;



public class VendeurService {
	
	private ArrayList<Vendeur> vendeurs;


	
	//constructeur : 
	
	public VendeurService() {
		vendeurs = new ArrayList<Vendeur>();
	}
	
	
	public VendeurService(ArrayList<Vendeur> vendeurs) {
		super();
		this.vendeurs = vendeurs;
	}


	
	//getters et setters : 
	
	public ArrayList<Vendeur> getVendeurs() {
		return vendeurs;
	}


	public void setVendeurs(ArrayList<Vendeur> vendeurs) {
		this.vendeurs = vendeurs;
	}	
	
	
	
	// methodes :
	
	
	
	public void save(Vendeur vendeur) {
		vendeurs.add(vendeur);
	}
	
	public void remove(Vendeur vendeur) {
		vendeurs.remove(vendeur);
	}

	// update :
	public void update(Vendeur vendeur) {
		for (Vendeur vend: vendeurs) {
			if (vend.getId() == vendeur.getId()) {
				vend = vendeur;
			}
		}
	}

	// findAll : 
	public ArrayList<Vendeur> findAll() {
		return vendeurs;
	}
	
	// findById : 
	public Vendeur findById(int id) {
		for (int i = 0; i < vendeurs.size(); i++) {
			Vendeur findVendeurById = vendeurs.get(i); 
			if (id == findVendeurById.getId()) {
				return vendeurs.get(i);
			}
		} return null;
	}
	
	
	
	
	
	
	
	
	
	
	// toString : 
	
	
	@Override
	public String toString() {
		return "VendeurService [vendeurs=" + vendeurs + "]";
	}
	
	
	
	
}
