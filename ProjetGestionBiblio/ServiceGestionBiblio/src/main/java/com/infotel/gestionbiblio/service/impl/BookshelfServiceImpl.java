package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookshelfDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.BookBasket;
import com.infotel.gestionbiblio.entity.Bookshelf;
import com.infotel.gestionbiblio.service.inter.BookshelfService;

@Service
@Transactional
public class BookshelfServiceImpl implements BookshelfService {
	@Autowired
	private BookshelfDao bookshelfDao;

	public void insert(final Bookshelf monObjet)
	{
		bookshelfDao.insert(monObjet);
	}
	
	
	public void delete(final Bookshelf object) {
		bookshelfDao.delete(object);
	}
	
	public void update(final Bookshelf object) {
		bookshelfDao.update(object);
	}
	
	public Bookshelf getById(int id) {
		return bookshelfDao.getById(id);
	}
	
	public Bookshelf getObjectByName(String nom) {
		return bookshelfDao.getObjectByName(nom);
	}
	
	public List<Bookshelf> getList(){
		return bookshelfDao.getList();
	}
}
