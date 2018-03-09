<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">
	<div class="starter-template">
		<br /> <br />
		<h1>${titrePage}</h1>
		<p class="lead">${sousTitrePage}</p>
	</div>
</div>

<c:forEach items="${books}" var="book">
	<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                        <div class="thumbnail">
                            <!--                         <img class="card-img-top" -->
                            <!--                             data-src="holder.js/100px225?theme=thumb&bg=55595c&fg=eceeef&text=Thumbnail" -->
                            <!--                             alt="Card image cap"> -->
                            <div class="card-body">
                            <h3>${book.bookTitre}</h3>
                          <div  class="caption">
                          
                          	<img style="max-width: 100px; height: auto;" src=<c:url value="/static/img${book.imagePath}"/> >
                          	
                          	<span>
	                            ${book.bookDescription}<br/>
	                            ${book.bookPrice} <i class="Eglyphicon glyphicon-euro"></i><br/>
                            <span id="imageProduit" class=".img-thumbnail rounded float-right" ></span>
                                
         
                                        <button type="button" class="btn" ><i class="glyphicon glyphicon-eye-open"></i></button>    
                                        <button type="button" class="btn" ><i class="glyphicon glyphicon-shopping-cart"></i></button>

                                </span>
                                </div>
                            </div>
                        </div>
                    </div>
</c:forEach>