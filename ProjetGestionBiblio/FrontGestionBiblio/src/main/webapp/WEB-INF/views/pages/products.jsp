<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2>Products page</h2>
<c:forEach items="${books}" var="book">
	<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
		<div class="thumbnail">
			<div class="caption">
				<h3>${book.bookTitre}</h3>
<%-- 				<p>${book.author.authorLastname}</p> --%>
<%-- 				<p>${book.author.authorFirstname}</p> --%>
				<p>Description : ${book.bookDescription}</p>
				<p>Prix : ${book.bookPrice}</p>
 				<c:if test="${book.periodicBook}"><p>Périodique</p></c:if> 
				<p>Editeur : ${book.editor.editorName}</p>
				<p>ISBN : ${book.ISBN}</p>
				<c:if test="${book.popularBook}"><p>Recommandé!</p></c:if>
				<p>Publication : ${book.publicationDate}</p>
				<img src=<c:url value="/static/img${book.imagePath}"/> >
			</div>
		</div>
	</div>
	
</c:forEach>