package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Adresse;

public class AdresseService {

	private ArrayList<Adresse> adresses;


	
	// constructeur :
	
	public AdresseService() {
		adresses = new ArrayList<Adresse>();
	}
	
	public AdresseService(ArrayList<Adresse> adresses) {
		super();
		this.adresses = adresses;
	}


	

// getters et setters : 
	
	public ArrayList<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(ArrayList<Adresse> adresses) {
		this.adresses = adresses;
	}


	
	
// methodes : 
	
	
	public void save(Adresse adresse) {
		adresses.add(adresse);
	}
	
	public void remove(Adresse adresse) {
		adresses.remove(adresse);
	}

	// update :
	public void update(Adresse adresse) {
		for (Adresse adre: adresses) {
			if (adre.getId() == adresse.getId()) {
				adre = adresse;
			}
		}
	}

	// findAll : 
	public ArrayList<Adresse> findAll() {
		return adresses;
	}
	
	// findById : 
	public Adresse findById(int id) {
		for (int i = 0; i < adresses.size(); i++) {
			Adresse findAdresseById = adresses.get(i); 
			if (id == findAdresseById.getId()) {
				return adresses.get(i);
			}
		} return null;
	}
	
	
	
	
	
// toString : 
	
	@Override
	public String toString() {
		return "AdresseService [adresses=" + adresses + "]";
	}

}
