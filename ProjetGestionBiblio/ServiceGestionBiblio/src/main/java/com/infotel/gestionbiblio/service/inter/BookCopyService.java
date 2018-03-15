 package com.infotel.gestionbiblio.service.inter;


import java.util.List;

import com.infotel.gestionbiblio.entity.BookCopy;

public interface BookCopyService {
	public void insert(final BookCopy monObjet);
	public void delete(final BookCopy object);
	public void update(final BookCopy object);
	public BookCopy getById(int id);
	public BookCopy getObjectByName(String nom) ;
	public List<BookCopy> getList();
}
