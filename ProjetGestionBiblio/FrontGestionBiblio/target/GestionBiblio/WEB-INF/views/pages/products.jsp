<h2>Products page</h2>
<c:forEach items="${books}" var="book">
	<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
		<div class="thumbnail">
			<div class="caption">
				<h3>${book.titre()}</h3>
				<p>${book.author()}</p>
				<p>${book.description()}</p>
				<p>${book.bookPrice()}</p>
				<p>${book.catalog()}</p>
				<p>${book.editor()}</p>
				<p>${book.imagePath()}</p>
				<p>${book.iSBN()}</p>
				<p>${book.popularBook()}</p>
				<p>${book.publicationDate()}</p>
			</div>
		</div>
	</div>
</c:forEach>