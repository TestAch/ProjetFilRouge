<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Roboto|VT323"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="../../ProjetFilRouge/css/file.css">
<title>Seller</title>
</head>
<body>
	<header>
		<c:import url="../../WEB-INF/shared/nav.jsp"></c:import>
	</header>
	<br>
	<br>
	<h2 class="center title">Welcome ${ utilisateur.prenom } ${ utilisateur.nom }
		!</h2>
	<br>
	<div class="parallax4">
		<br>
		<h4 class="center bg-white text-dark">Add new product</h4>
		<br>
		<form action="gestionvendeur" method="POST">
			<div class="center">
				<label class="bg-white text-dark" for="id">Id</label> <input
					class="margin-auth" type=text id=id name=id>
			</div>
			<div class="center">
				<label class="bg-white text-dark" for="nomArticle">Name</label> <input
					class="margin-auth" type=text id=nomArticle name=nomArticle>
			</div>
			<div class="center">
				<label class="bg-white text-dark" for="designation">Description</label>
				<input class="margin-auth" type=text id=designation name=designation>
			</div>
			<div class="center">
				<label class="bg-white text-dark" for="prixUnitaire">Price</label> <input
					class="margin-auth" type=number id=prixUnitaire name=prixUnitaire>
			</div>
			<div class="center">
				<label class="bg-white text-dark" for="quantiteEnStock">Amount
					in stock</label> <input class="margin-auth" type=number id=quantiteEnStock
					name=quantiteEnStock>
			</div>
			<div class="center">
				<label class="bg-white text-dark" for="url">Url</label> <input
					class="margin-auth" type=text id=url name=url>
			</div>
			<br>
			<button class="btn btn-secondary btn-lg btn-block">Add new
				product</button>
		</form>
		<br>
		<br>
		<br>
		<br>
		<hr />
		<br>
		<h4 class="center bg-white text-dark">Your inventory : </h4>
		<br>
		<br>
		<div class="spacea flex mainbottom mobilenoshow wrap">
			<!-- <h2 class=colorb>Projets</h2> -->
			<article class="mainarticle">
				<a href="https://flabouche.github.io/P-tisserie/">
					<h5 class="center-text">${ produits[0].nomArticle }</h5> <img
					class="img" src="images/Sans titre.jpg" alt="Smartphone">
					<p class="center-text">Stock : ${ produits[0].quantiteEnStock }</p>
					<p class="center-text">${ produits[0].prixUnitaire }€</p>
				</a>
			</article>
			<article class="mainarticle">
				<a href="https://flabouche.github.io/Terre-de-Geek/"><h5
						class="center-text">${ produits[1].nomArticle }</h5> <img
					class="img" src="images/Sans titre2.jpg" alt="Mouse">
					<p class="center-text">Stock : ${ produits[1].quantiteEnStock }</p>
					<p class="center-text">${ produits[1].prixUnitaire }€</p> </a>
			</article>
			<article class="mainarticle marginresponsive">
				<a href="https://flabouche.github.io/Ocea/"><h5
						class="center-text">${ produits[2].nomArticle }</h5> <img
					class="img" src="images/Sans titre3.jpg" alt="Oscilloscope">
					<p class="center-text">Stock : ${ produits[2].quantiteEnStock }</p>
					<p class="center-text">${ produits[2].prixUnitaire }€</p> </a>
			</article>
			<article class="mainarticle marginresponsive">
				<a href="https://flabouche.github.io/Twitter/"><h5
						class="center-text">${ produits[3].nomArticle }</h5> <img
					class="img" src="img/oq5.png" alt="img4">
					<p class="center-text">Stock : ${ produits[3].quantiteEnStock }</p>
					<p class="fontsize center-text">${ produits[3].prixUnitaire }€</p></a>
			</article>
			<article class="mainarticle">
				<a href="https://github.com/Flabouche/bankPOO"><h5
						class="center-text">${ produits[4].nomArticle }</h5> <img
					class="img" src="img/oq6.png" alt="img5">
					<p class="center-text">Stock : ${ produits[3].quantiteEnStock }</p>
					<p class="fontsize center-text">${ produits[4].prixUnitaire }€</p></a>
		</div>
		<br>
		<br>
		<br>
	</div>
</body>
</html>