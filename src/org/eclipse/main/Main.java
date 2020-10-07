package org.eclipse.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bonjour, si vous êtes vendeur tapez 1 ou si vous êtes acheteur tapez 2 : ");
		int user = scanner.nextInt();
		if (user == 1) {
			System.out.println("Bonjour vendeur");
		} else if (user == 2) {
			System.out.println("Bonjour acheteur");
		}
	}

}
