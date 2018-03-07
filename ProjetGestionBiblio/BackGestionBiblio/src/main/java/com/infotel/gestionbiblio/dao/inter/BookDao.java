package com.infotel.gestionbiblio.dao.inter;

import java.util.List;

import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.Category;

public interface BookDao {

	public List<Book>getBookRecommandes();
	public List<Book>getBookByCat(Category cat);
	public List<Book>getPeriodique();
	public List<Book>getBookByAuthor(Author author);
	public List<Book>getBookByRecherche(String recherche);
	
}
 