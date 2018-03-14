<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">
	<div class="starter-template">
		<br /> <br />
		<h1>${titrePage}</h1>
		<p class="lead">${sousTitrePage}</p>
	</div>
</div>

<div class="row">
	<div class="col-sm-2">
		<input type="text" class="form-control" placeholder="Title" id="title"
			name="title">
		<div class="form-check">
			<c:forEach items="${authors}" var="author">
				<input type="checkbox" class="form-check-input" id="exampleCheck1" type="checkbox" name="selection" value="${author.id}">
			</c:forEach>
		</div>
		<div class="form-check">
			<c:forEach items="${editors}" var="editor">
				<input type="checkbox" class="form-check-input" id="exampleCheck1" type="checkbox" name="selection" value="${editor.id}">
			</c:forEach>
		</div>
		<div class="form-check">
			<c:forEach items="${categories}" var="category">
				<input type="checkbox" class="form-check-input" id="exampleCheck1" type="checkbox" name="selection" value="${category.id}">
			</c:forEach>
		</div>
	</div>
	<div class="col-sm-1"></div>
	<c:forEach items="${books}" var="book">
		<div>
			<div class="col-sm-1">
				<img style="max-width: 150px; height: auto;"
					src=<c:url value="/static/img${book.imagePath}"/>>
			</div>
			<div class="col-sm-1">
				<h3>${book.bookTitre}</h3>
				<span> ${book.bookDescription}<br /> ${book.bookPrice} <i
					class="Eglyphicon glyphicon-euro"></i><br />
					<button type="button" class="btn">
						<i class="glyphicon glyphicon-eye-open"></i>
					</button>
					<button type="button" class="btn">
						<i class="glyphicon glyphicon-shopping-cart"></i>
					</button>
				</span>
			</div>
		</div>
	</c:forEach>
	<div class="col-sm-1"></div>
</div>
