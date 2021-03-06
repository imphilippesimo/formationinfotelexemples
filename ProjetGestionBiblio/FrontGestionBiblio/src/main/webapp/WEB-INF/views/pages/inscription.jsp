<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">
	<div class="starter-template">
		<br/> <br/>
		<h1>${titrePage}</h1>
		<p class="lead">${sousTitrePage}</p>
	</div>
</div>

<c:if test="${inscription}"><div class="alert alert-success">
  <strong>Success!</strong> Utilisateur ajout�
</div></c:if>

<!-- <div class="row"> -->
<!-- <div class="col-sm-4"></div> -->
<!-- <div class="col-sm-4"> -->
<!-- <form class="form-group" -->
<%-- 	action="${pageContext.request.contextPath}/inscription"> --%>
<!-- 	<input id="nom" type="text" class="form-control" name="nom" placeholder="Nom">  -->
<!-- 	<input id="prenom" type="text" class="form-control" name="prenom" placeholder="Prenom">  -->
<!-- 	<input id="mail" type="text" class="form-control" name="mail" placeholder="Mail">  -->
<!-- 	<input id="pwd" type="text" class="form-control" name="pwd" placeholder="Password">  -->
<!-- 	<input id="adresse" type="text" class="form-control" name="adresse" placeholder="Adresse">  -->
<!-- 	<input id="ville" type="text" class="form-control" name="ville" placeholder="Ville">  -->
<!-- 	<input id="codePostal" type="text" class="form-control" name="codePostal" placeholder="CodePostal">  -->
<!-- 	<input id="tel" type="text" class="form-control" name="tel" placeholder="Tel">  -->

<!-- 	<button type="submit" class="btn btn-default">Inscrire</button> -->
<!-- </form> -->
<!-- </div> -->
<!-- <div class="col-sm-4"></div> -->
<!-- </div> -->

<form>
  <div class="form-row">
  <div class="col-md-4 mb-3">
      <label for="validationServer02">Pr�nom</label>
      <input type="text" class="form-control is-valid" id="prenom" placeholder="prenom" required>
      <div class="valid-feedback">
        Ok
      </div>
    </div>
    <div class="col-md-4 mb-3">
      <label for="validationServer01">Nom</label>
      <input type="text" class="form-control is-valid" id="nom" placeholder="Nom" required>
      <div class="valid-feedback">
        Ok
      </div>
    </div>
    
    <div class="col-md-4 mb-3">
      <label for="validationServerUsername">Mail</label>
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text" id="inputGroupPrepend3">@</span>
        </div>
        <input type="text" class="form-control is-invalid" id="mail" placeholder="mail" aria-describedby="inputGroupPrepend3" required>
        <div class="invalid-feedback">
          Entrez une adresse mail correcte svp.
        </div>
      </div>
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="validationServer03">Ville</label>
      <input type="text" class="form-control is-invalid" id="ville" placeholder="Ville" required>
      <div class="invalid-feedback">
        Entrez un nom de ville valide svp.
      </div>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationServer04">Adresse</label>
      <input type="text" class="form-control is-invalid" id="adresse" placeholder="adresse" required>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationServer05">Code postal</label>
      <input type="text" class="form-control is-invalid" id="codePostal" placeholder="codePostal" required>
      <div class="invalid-feedback">
        Entrez un code postal valide svp.
      </div>
    </div>
  </div>
  <button class="btn btn-primary" type="submit">Submit form</button>
</form>