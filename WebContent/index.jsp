<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/a6c393237d.js"></script>
<link href="https://fonts.googleapis.com/css?family=Roboto|VT323"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/file.css">
<title>Home</title>
</head>
<body>
	<header>
		<c:import url="WEB-INF/shared/nav.jsp"></c:import>
	</header>
	<br>
	<br>
	<h2 class="title center">Welcome to Happy Store</h2>
	<hr />
	<!-- 	<div class="parallax">
		<div class="space-around">
			<div class="articles column">
				<h4 class="backgroundwhite margin-top-articles center">Smartphone</h4>
				<img  src="images/Hand-smartphone-technology-calling.jpg" alt="Smartphone">
				<h4 class="backgroundwhite center">199€</h4>
			</div>
			<div class="articles column">
				<h4 class="backgroundwhite margin-top-articles center">Mouse</h4>
				<img  src="images/Apple_desktop_mouse_II_small.jpg" alt="Souris">
				<h4 class="backgroundwhite center">29€</h4>
			</div>
			<h4 class="backgroundwhite margin-top-articles">Article 3</h4>
			<h4 class="backgroundwhite margin-top-articles">Article 4</h4>
			<h4 class="backgroundwhite margin-top-articles">Article 5</h4>
		</div>
	</div> -->

	<div class="parallax spacea flex mainbottom mobilenoshow wrap">
		<!-- <h2 class=colorb>Projets</h2> -->
		<article class="mainarticle">
			<a href="https://flabouche.github.io/P-tisserie/">
				<h5 class="center-text">${ produits[0].nomArticle }</h5> <img class="img"
				src="images/Sans titre.jpg" alt="Smartphone">
				<p class="center-text">Stock : ${ produits[0].quantiteEnStock }</p>
				<p class="center-text">${ produits[0].prixUnitaire }€</p>
			</a>
		</article>
		<article class="mainarticle">
			<a href="https://flabouche.github.io/Terre-de-Geek/"><h5
					class="center-text">${ produits[1].nomArticle }</h5> <img class="img"
				src="images/Sans titre2.jpg" alt="Mouse">
				<p class="center-text">Stock : ${ produits[1].quantiteEnStock }</p>
				<p class="center-text">${ produits[1].prixUnitaire }€</p> </a>
		</article>
		<article class="mainarticle marginresponsive">
			<a href="https://flabouche.github.io/Ocea/"><h5
					class="center-text">${ produits[2].nomArticle }</h5> <img class="img"
				src="images/Sans titre3.jpg" alt="Oscilloscope">
				<p class="center-text">Stock : ${ produits[2].quantiteEnStock }</p>
				<p class="center-text">${ produits[2].prixUnitaire }€</p> </a>
		</article>
		<article class="mainarticle marginresponsive">
			<a href="https://flabouche.github.io/Twitter/"><h5
					class="center-text">${ produits[3].nomArticle }</h5> <img class="img"
				src="img/oq5.png" alt="img4">
				<p class="center-text">Stock : ${ produits[3].quantiteEnStock }</p>
				<p class="fontsize center-text">${ produits[3].prixUnitaire }€</p></a>
		</article>
		<article class="mainarticle">
			<a href="https://github.com/Flabouche/bankPOO"><h5
					class="center-text">${ produits[4].nomArticle }</h5> <img class="img"
				src="img/oq6.png" alt="img5">
				<p class="center-text">Stock : ${ produits[3].quantiteEnStock }</p>
				<p class="fontsize center-text">${ produits[4].prixUnitaire }€</p></a>
	</div>



	<hr />
	<ul class="pagination center">
		<li class="page-item"><a class="page-link" href="#">Previous</a></li>
		<li class="page-item active"><a class="page-link" href="#">1</a></li>
		<li class="page-item"><a class="page-link" href="#">2</a></li>
		<li class="page-item"><a class="page-link" href="#">3</a></li>
		<li class="page-item"><a class="page-link" href="#">Next</a></li>
	</ul>
</body>
</html>
