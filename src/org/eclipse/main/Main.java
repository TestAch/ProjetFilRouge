package org.eclipse.main;



import org.eclipse.model.Produit;
import org.eclipse.model.Vendeur;
import org.eclipse.service.ProduitService;
import org.eclipse.service.VendeurService;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
		
		ProduitService produitService = new ProduitService();
		Produit produit1 = new Produit (1, "clavier", "clavier azerty", 19, 10, "fgjh");
		produitService.save(produit1);
				
		Produit produit2 = new Produit (2, "souris", "souris sans fil", 8, 20, "zsrgfgjh");
		produitService.save(produit2);
		
		Produit produit3 = new Produit (3, "lapin", "lapin sans culotte", 2.35, 0, "qwqsh");
		produitService.save(produit3);
		
		Produit produit4 = new Produit (4, "loup", "loup qui danse", 8.45, 0, "rhsgq");
		produitService.save(produit4);
		
		Produit produit5 = new Produit (5, "mouton", "mouton en transe", 12.05, 99, "rhsgq");
		produitService.save(produit5);
		
		VendeurService vendeurService = new VendeurService();
		Vendeur vendeur1 = new Vendeur (1, "Doe", "john", "john.doe@online.com", "0205070806", "zef", "az", null, new Produit []{produit1});
		vendeurService.save(vendeur1);
		
		
//		
//		produitService.remove(produit);
//		
		
		// 1er affichage : 
		System.out.println(produitService.getProduits());
		
		produitService.remove(produit2);
		
		
		//2ème affichage : 
		System.out.println(produitService.getProduits());
		
		produit1.setQuantiteEnStock(1000);
		produitService.update(produit1);

		//3ème affichage find all : 
		System.out.println(produitService.findAll());
		
		//4ème affichage by Id : 
		System.out.println(produitService.findById(3));
		
		//5ème affichage produits disponibles : 
		System.out.println(produitService.findByQuantiteEnStock());
		
		System.out.println(vendeurService.getVendeurs());
		
		
//		System.out.println("Bonjour, si vous êtes vendeur tapez 1 ou si vous êtes acheteur tapez 2 : ");
//		int user = scanner.nextInt();
//		if (user == 1) {
//			System.out.println("Bonjour vendeur");
//		} else if (user == 2) {
//			System.out.println("Bonjour acheteur");
//		}
	}

}
