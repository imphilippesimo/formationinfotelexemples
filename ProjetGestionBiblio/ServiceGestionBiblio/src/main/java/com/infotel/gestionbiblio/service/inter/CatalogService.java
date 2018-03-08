package com.infotel.gestionbiblio.service.inter;


import java.util.List;

import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.Bookshelf;
import com.infotel.gestionbiblio.entity.Catalog;

public interface CatalogService {
	public void insert(final Catalog monObjet);
	public void delete(final Catalog object);
	public void update(final Catalog object);
	public Catalog getById(int id);
	public Catalog getObjectByName(String nom) ;
	public List<Catalog> getList();
}
