package com.infotel.gestionbiblio.service.inter;


import java.util.List;

import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.Bookshelf;
import com.infotel.gestionbiblio.entity.Library;

public interface LibraryService {
	public void insert(final Library monObjet);
	public void delete(final Library object);
	public void update(final Library object);
	public Library getById(int id);
	public Library getObjectByName(String nom) ;
	public List<Library> getList();
}
