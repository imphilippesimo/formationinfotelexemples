<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- <table class="table table-hover table-striped"> -->
<%-- 	<c:forEach items="${books}" var="book"> --%>
<!-- 		<tr class="thumbnail"> -->
			
<%-- 			<td style="vertical-align: middle;"><img style="max-width: 100px; height: auto;" src=<c:url value="/static/img${book.imagePath}"/> ></td> --%>
<%-- 			<td style="vertical-align: middle;"><h3>${book.bookTitre}</h3></td> --%>
<%-- 			<td style="vertical-align: middle;">${book.bookDescription}</td>  --%>
<%-- 			<td style="vertical-align: middle;">${book.bookPrice}</td> --%>
<!-- 			<td style="vertical-align: middle;"> -->
<!-- 				<button type="button" class="btn" ><i class="glyphicon glyphicon-minus"></i></button> -->
<!--             </td> -->
                                        
<!-- 		</tr> -->
<%-- 	</c:forEach> --%>
<!-- </table> -->
<div class="container">
           <div class="panel panel-primary">
               <div class="panel-heading">
                   <h3>${titrePage}</h3>
                   <p class="lead">${sousTitrePage}</p>
               </div>
               <div class="panel-body">
                   <div class="table-responsive">
                       <table class="table table-striped">
                           <thead>
                               <tr>
                                   <th></th>
                                   <th style='text-align:left'>Titre</th>
                                   <th style='text-align:left'>Prix</th>
                                   <th style='text-align:left'>Auteur(s)</th>
                                   <th style='text-align:left'>Editeur</th>
                                   <th style='text-align:left'>Actions</th>
                               </tr>
                           </thead>
                           <tbody id="contenant">
                           <c:forEach items="${books}" var="book">
                               <tr>
                                   <td><img style="max-width: 100px; height: auto;" src=<c:url value="/static/img${book.imagePath}"/> ></td>
                                   <td style="vertical-align: middle;">${book.bookTitre}</td>
                                   <td style="vertical-align: middle;">${book.bookPrice}<i class="Eglyphicon glyphicon-euro"></i></td>
                                    <td style="vertical-align: middle;">
                                    <c:forEach items="${book.author}" var="auteur">
                                    	<span> ${auteur.authorFirstname} ${auteur.authorLastname} |</span>
                                    </c:forEach>
                                    </td>
                                    <td style="vertical-align: middle;">${book.editor.editorName}</td> 
                                   <td style="vertical-align: middle;">
                                       <form method="get" action="BookDetail">
                                           <input type="hidden" name="id" value="${book.ISBN}">
                                           <input type="submit" class="btn btn-info" value="Détail">
                                       </form>
                                   </td>
                               </tr>
                           </c:forEach>
                           </tbody>
                       </table>
                   </div>
               </div>
           </div>
       </div>