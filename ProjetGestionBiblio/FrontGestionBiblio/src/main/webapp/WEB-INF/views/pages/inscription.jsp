<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">
	<div class="starter-template">
		<br/> <br/>
		<h1>${titrePage}</h1>
		<p class="lead">${sousTitrePage}</p>
	</div>
</div>

<c:if test="${inscription}"><div class="alert alert-success">
  <strong>Success!</strong> Utilisateur ajouté
</div></c:if>
<%-- <c:if test="${!inscription}"><script type="text/javascript"> --%>
<!--  window.alert("ATTENTION : Utilisateur non ajouté!") -->
<%-- </script></c:if> --%>
<form class="form-group"
	action="${pageContext.request.contextPath}/inscription">
	<input id="nom" type="text" class="form-control" name="nom" placeholder="Nom"> 
	<input id="prenom" type="text" class="form-control" name="prenom" placeholder="Prenom"> 
	<input id="mail" type="text" class="form-control" name="mail" placeholder="Mail"> 
	<input id="pwd" type="text" class="form-control" name="pwd" placeholder="Password"> 
	<input id="adresse" type="text" class="form-control" name="adresse" placeholder="Adresse"> 
	<input id="ville" type="text" class="form-control" name="ville" placeholder="Ville"> 
	<input id="codePostal" type="text" class="form-control" name="codePostal" placeholder="CodePostal"> 
	<input id="tel" type="text" class="form-control" name="tel" placeholder="Tel"> 

	<button type="submit" class="btn btn-default">Inscrire</i>
	</button>
</form>