package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.model.Produit;
import org.eclipse.service.ProduitService;




@WebServlet("/gestionvendeur")
public class GestionVendeurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProduitService produitService = new ProduitService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("produits", produitService.findAll());
		getServletContext().getRequestDispatcher("/WEB-INF/utilisateur/produitutilisateur.jsp").forward(request,
				response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nomArticle = request.getParameter("nomArticle");
		String designation = request.getParameter("designation");
		double prixUnitaire =  Integer.parseInt(request.getParameter("prixUnitaire"));
		int quantiteEnStock =  Integer.parseInt(request.getParameter("quantiteEnStock"));
		String url = request.getParameter("url");
		Produit produit = new Produit(id, nomArticle, designation, prixUnitaire, quantiteEnStock, url);
		produitService.save(produit);
		doGet(request, response);
	}

}
