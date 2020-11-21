<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Roboto|VT323" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="../../ProjetFilRouge/css/file.css">
<title>Page d'authentification</title>
</head>
<body>
	<header>
		<c:import url="../../WEB-INF/shared/nav.jsp"></c:import>
	</header>
	<br>
	<br>
	<h2 class="center title">Authentication page for seller</h2>
	<br>
	<div class="parallax2">
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<form action="utilisateur" method="POST">
			<div class="center">
				<label class="bg-white text-dark" for="login">Username</label> <input class="margin-auth" type=text id=login name=login>
			</div>
			<br>
			<div class="center">
				<label class="bg-white text-dark" for="motDePasse">Password</label> <input class="margin-auth" type=password id=motDePasse name=motDePasse>
			</div>
			<br>
			<br>
			<button class="btn btn-secondary btn-lg btn-block">Authenticate</button>
		</form>
	</div>	
</body>
</html>