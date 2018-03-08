package com.infotel.gestionbiblio.service.inter;


import java.util.List;

import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.Bookshelf;
import com.infotel.gestionbiblio.entity.Borrow;

public interface BorrowService {
	public void insert(final Borrow monObjet);
	public void delete(final Borrow object);
	public void update(final Borrow object);
	public Borrow getById(int id);
	public Borrow getObjectByName(String nom) ;
	public List<Borrow> getList();
}
