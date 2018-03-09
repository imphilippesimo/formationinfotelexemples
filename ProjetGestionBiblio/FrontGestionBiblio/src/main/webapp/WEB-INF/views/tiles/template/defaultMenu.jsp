<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- <a class="navbar-brand" href="#">Gestionnaire de bibliotheque</a>-->
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a
					href="${pageContext.request.contextPath}/">Accueil</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown"
					href="${pageContext.request.contextPath}/products">Livres<span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="${pageContext.request.contextPath}/products">Recherche</a></li>
						<li><a href="${pageContext.request.contextPath}/products">Periodiques</a></li>
						<li><a href="${pageContext.request.contextPath}/products">Auteurs</a></li>
					</ul></li>
				<li><a href="${pageContext.request.contextPath}">Panier</a></li>
				<!-- Si on est connecté en tant que membre -->
				<li><a href="${pageContext.request.contextPath}/compte">Mon
						compte</a></li>
				<!-- Si on est admin -->
				<li><a href="${pageContext.request.contextPath}/gestioncompte">Gestion
						membres et paniers</a></li>
				<li>
								<!-- Recherche -->
					<form class="form-group" action="${pageContext.request.contextPath }/products">
						<input id="search"	type="text" class="form-control" name="search"	placeholder="Search">
						<button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
					</form>
				</li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<!-- Si on est pas connect(é -->
				<li><a href="${pageContext.request.contextPath}/inscription"><span
						class="glyphicon glyphicon-user"></span> S'inscrire</a></li>
				<!-- Si on est connecté en tant que membre ou admin -->
				<li><a href="${pageContext.request.contextPath}/login"><span
						class="glyphicon glyphicon-log-in"></span>Se connecter</a></li>
			</ul>
		</div>
	</div>
</nav>