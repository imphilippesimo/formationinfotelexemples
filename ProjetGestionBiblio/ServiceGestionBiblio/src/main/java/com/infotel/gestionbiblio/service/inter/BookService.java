 package com.infotel.gestionbiblio.service.inter;

import java.util.List;

import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.BookCopy;
import com.infotel.gestionbiblio.entity.Category;

public interface BookService {
	public List<Book> getBookRecommandes();
	public List<Book> getBookByCat(Category cat);
	public List<Book> getPeriodique();
	public List<Book> getBookByAuthor(Author author);
	public List<Book> getBookByRecherche(String recherche);
	
	public void insert(final Book monObjet);
	public void delete(final Book object);
	public void update(final Book object);
	public Book getById(int id);
	public Book getObjectByName(String nom) ;
	public List<Book> getList();
}
