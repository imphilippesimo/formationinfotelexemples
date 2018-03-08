package com.infotel.gestionbiblio.service.inter;


import java.util.List;

import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.BookCopy;
import com.infotel.gestionbiblio.entity.Bookshelf;

public interface BookshelfService {
	public void insert(final Bookshelf monObjet);
	public void delete(final Bookshelf object);
	public void update(final Bookshelf object);
	public Bookshelf getById(int id);
	public Bookshelf getObjectByName(String nom) ;
	public List<Bookshelf> getList();
}
