package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Utilisateur;




public class UtilisateurService {

		private ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();


		
		public UtilisateurService() {
			utilisateurs.add(new Utilisateur(1, "Wick","John", "john@gmail.com", "0147403020", "vendeur", "vendeur", "2 rue de la mouette 75015 Paris", "vendeur"));
			utilisateurs.add(new Utilisateur(2, "Dalton","Jack", "jack@gmail.com", "0147443020", "acheteur", "acheteur", "4 rue de la prairie 75008 Paris", "acheteur"));
			utilisateurs.add(new Utilisateur(3, "Glou","Mitro", "mitro@gmail.com", "3347403020", "vendeur2", "vendeur2", "10 rue de la moumoute 75011 Paris", "vendeur"));
		}
		

		
// getters et setters : 
		
		public ArrayList<Utilisateur> getUtilisateurs() {
			return utilisateurs;
		}

		public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
			this.utilisateurs = utilisateurs;
		}


		
// methodes : 
		
		
		public void save(Utilisateur utilisateur) {
			utilisateurs.add(utilisateur);
		}
		
		public void remove(Utilisateur utilisateur) {
			utilisateurs.remove(utilisateur);
		}

		// update :
		public void update(Utilisateur utilisateur) {
			for (Utilisateur util: utilisateurs) {
				if (util.getId() == utilisateur.getId()) {
					util = utilisateur;
				}
			}
		}

		// findAll : 
		public ArrayList<Utilisateur> findAll() {
			return utilisateurs;
		}
		
		// findById : 
		public Utilisateur findById(int id) {
			for (int i = 0; i < utilisateurs.size(); i++) {
				Utilisateur findUtilisateurById = utilisateurs.get(i); 
				if (id == findUtilisateurById.getId()) {
					return utilisateurs.get(i);
				}
			} return null;
		}
		
		
		// findByLoginAndPassword : 
		
		public Utilisateur findByLoginAndPassword (String login, String motDePasse){
//			for (int i = 0; i < utilisateurs.size(); i++) {
//				Utilisateur utili = utilisateurs.get(i);
//				if ((login.equals(utili.getLogin())) && (motDePasse.equals(utili.getMotDePasse()))) {
//					return utilisateurs.get(i);
//				}
//			}
//			return null;
			for(Utilisateur utilisateur: utilisateurs) {
				if(utilisateur.getLogin().equals(login) &&utilisateur.getMotDePasse().equals(motDePasse)) {
					return utilisateur;
				}
			}
		return null;
		}
		
		
		
		
		
		
// toString : 
		
		
		@Override
		public String toString() {
			return "UtilisateurService [utilisateurs=" + utilisateurs + "]";
		}
		
	
}
