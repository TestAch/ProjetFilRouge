<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://kit.fontawesome.com/a6c393237d.js"></script>
<link rel="stylesheet" type="text/css" href="css/file.css">
</head>

<nav class="navbar navbar-expand-lg navbar-dark back-dark">
  <a class="navbar-brand" href="home">Happy Store</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse margin-nav" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="home">Home <span class="sr-only"></span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="utilisateur">Seller</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="client">Buyer</a>
      </li>
      <c:if test="${ sessionScope.utilisateur.type != acheteur }">
      	<li class="nav-item">
		<a class="nav-link" href="#">Basket</a>
      	</li>
      </c:if>
	  <c:if test="${ sessionScope.utilisateur != null }">
	  	<li class="flex-end nav-item">
		<a class="nav-link" href="deconnection">Disconnection</a>
      	</li>
	  </c:if>
    </ul>
  </div>
</nav>