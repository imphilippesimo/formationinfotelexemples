 package com.infotel.gestionbiblio.service.inter;


import java.util.List;

import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.Bookshelf;
import com.infotel.gestionbiblio.entity.Category;

public interface CategoryService {
	public void insert(final Category monObjet);
	public void delete(final Category object);
	public void update(final Category object);
	public Category getById(int id);
	public Category getObjectByName(String nom) ;
	public List<Category> getList();
}
