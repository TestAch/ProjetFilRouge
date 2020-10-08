package org.eclipse.main;



import org.eclipse.model.Produit;
import org.eclipse.service.ProduitService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
		
		ProduitService produitService = new ProduitService();
		Produit produit1 = new Produit (1, "clavier", "clavier azerty", 19, 10, "fgjh");
		produitService.save(produit1);
				
		Produit produit2 = new Produit (2, "souris", "souris sans fil", 8, 20, "zsrgfgjh");
		produitService.save(produit2);
		
		Produit produit3 = new Produit (3, "lapin", "lapin sans culotte", 2.35, 20, "qwqsh");
		produitService.save(produit3);
		
		
//		
//		produitService.remove(produit);
//		
		
		System.out.println(produitService.getProduits());
		
		produitService.remove(produit2);
		produit1.setQuantiteEnStock(1000);
		produitService.update(produit1);

		
		System.out.println(produitService.getProduits());
		
		System.out.println(produitService.findAll());
		
//		System.out.println(produitService.findById(1));
		
		
//		System.out.println("Bonjour, si vous êtes vendeur tapez 1 ou si vous êtes acheteur tapez 2 : ");
//		int user = scanner.nextInt();
//		if (user == 1) {
//			System.out.println("Bonjour vendeur");
//		} else if (user == 2) {
//			System.out.println("Bonjour acheteur");
//		}
	}

	private static void findAll() {
		// TODO Auto-generated method stub
		
	}

}
