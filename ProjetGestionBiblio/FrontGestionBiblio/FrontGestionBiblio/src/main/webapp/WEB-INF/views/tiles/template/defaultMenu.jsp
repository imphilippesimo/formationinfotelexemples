<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     <!-- <a class="navbar-brand" href="#">Gestionnaire de bibliotheque</a>-->
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="${pageContext.request.contextPath}/">Accueil</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath}/products">Livres<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath}/products/recherche">Recherche</a></li>
            <li><a href="${pageContext.request.contextPath}/products/periodique">Periodiques</a></li>
            <li><a href="${pageContext.request.contextPath}/products/auteur">Auteurs</a></li>
          </ul>
        </li>
        <li><a href="${pageContext.request.contextPath}">Panier</a></li>
        <!-- Si on est connecté en tant que membre -->
        <li><a href="${pageContext.request.contextPath}/compte">Mon compte</a></li>
        <!-- Si on est admin -->
        <li><a href="${pageContext.request.contextPath}/gestioncompte">Gestion membres et paniers</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <!-- Si on est pas connect(é -->
        <li><a href="${pageContext.request.contextPath}/inscription"><span class="glyphicon glyphicon-user"></span> S'inscrire</a></li>
        <!-- Si on est connecté en tant que membre ou admin -->
        <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span>Se connecter</a></li>
      </ul>
    </div>
  </div>
</nav>