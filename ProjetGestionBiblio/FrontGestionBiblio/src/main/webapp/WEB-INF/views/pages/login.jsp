<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">
	<div class="starter-template">
		<br /> <br />
		<h1>${titrePage}</h1>
		<p class="lead">${sousTitrePage}</p>
	</div>
</div>

<form action="${pageContext.request.contextPath}/login">
  <div class="input-group">
    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
    <input id="email" type="text" class="form-control" name="email" placeholder="Email">
  </div>
  <div class="input-group">
    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
    <input id="password" type="password" class="form-control" name="password" placeholder="Password">
  </div>
	<button type="submit" class="btn btn-default">Connexion</button>
</form>