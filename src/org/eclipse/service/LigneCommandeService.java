package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.LigneCommande;



public class LigneCommandeService {

	private ArrayList<LigneCommande> lignesCommande;


	
// constructeur :
	
	public LigneCommandeService() {
		lignesCommande = new ArrayList<LigneCommande>();
	}
	
	
	public LigneCommandeService(ArrayList<LigneCommande> lignesCommande) {
		super();
		this.lignesCommande = lignesCommande;
	}



	
// getters et setters : 
	
	public ArrayList<LigneCommande> getLignesCommande() {
		return lignesCommande;
	}


	public void setLignesCommande(ArrayList<LigneCommande> lignesCommande) {
		this.lignesCommande = lignesCommande;
	}



	
	
// methodes : 
	
	
	public void save(LigneCommande ligneCommande) {
		lignesCommande.add(ligneCommande);
	}
	
	public void remove(LigneCommande ligneCommande) {
		lignesCommande.remove(ligneCommande);
	}

	// update :
	public void update(LigneCommande ligneCommande) {
		for (LigneCommande ligneC: lignesCommande) {
			if (ligneC.getId() == ligneCommande.getId()) {
				ligneC = ligneCommande;
			}
		}
	}

	// findAll : 
	public ArrayList<LigneCommande> findAll() {
		return lignesCommande;
	}
	
	// findById : 
	public LigneCommande findById(int id) {
		for (int i = 0; i < lignesCommande.size(); i++) {
			LigneCommande findLigneComById = lignesCommande.get(i); 
			if (id == findLigneComById.getId()) {
				return lignesCommande.get(i);
			}
		} return null;
	}
	
	
	
	
	
// toString : 
	
	@Override
	public String toString() {
		return "LigneCommandeService [lignesCommande=" + lignesCommande + "]";
	}
	
}
