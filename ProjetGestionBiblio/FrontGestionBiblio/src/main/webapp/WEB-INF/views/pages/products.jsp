<h2>Products page</h2>
<c:forEach items="${books}" var="book">
	<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
		<div class="thumbnail">
			<div class="caption">
				<h3>${book.getBookTitre()}</h3>
				<p>book.getAuthor();</p>
				<p>${book.getBookDescription()}</p>
				<p>${book.getBookPrice()}</p>
				<p>${book.getCatalog()}</p>
				<p>${book.getEditor()}</p>
				<p>${book.getImagePath()}</p>
				<p>${book.getISBN()}</p>
				<p>${book.getPopularBook()}</p>
				<p>${book.getPublicationDate()}</p>
			</div>
		</div>
	</div>
</c:forEach>