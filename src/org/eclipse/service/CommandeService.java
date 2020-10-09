package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Commande;


public class CommandeService {

	private ArrayList<Commande> commandes;


	
// contructeur : 
	
	public CommandeService() {
		commandes = new ArrayList<Commande>();
	}
	
	
	public CommandeService(ArrayList<Commande> commandes) {
		super();
		this.commandes = commandes;
	}



// getters and setters : 
	
	public ArrayList<Commande> getCommandes() {
		return commandes;
	}


	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}


	
// methodes : 
	
	
	public void save(Commande commande) {
		commandes.add(commande);
	}
	
	public void remove(Commande commande) {
		commandes.remove(commande);
	}

	// update :
	public void update(Commande commande) {
		for (Commande comm: commandes) {
			if (comm.getId() == commande.getId()) {
				comm = commande;
			}
		}
	}

	// findAll : 
	public ArrayList<Commande> findAll() {
		return commandes;
	}
	
	// findById : 
	public Commande findById(int id) {
		for (int i = 0; i < commandes.size(); i++) {
			Commande findCommandeById = commandes.get(i); 
			if (id == findCommandeById.getId()) {
				return commandes.get(i);
			}
		} return null;
	}
	
	
	
	
// to String : 
	
	@Override
	public String toString() {
		return "CommandeService [commandes=" + commandes + "]";
	}
	
	
}
