 package com.infotel.gestionbiblio.service.inter;

import java.util.List;

import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Book;

public interface AuthorService {
	public void insert(final Author monObjet);
	public void delete(final Author object);
	public void update(final Author object);
	public Author getById(int id);
	public Author getObjectByName(String nom) ;
	public List<Author> getList();
}
