package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.BookCopy;
import com.infotel.gestionbiblio.entity.Category;
import com.infotel.gestionbiblio.service.inter.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
	
	
		
	@Override
	public List<Book> getBookRecommandes() {
		// TODO Auto-generated method stub
		return bookDao.getBookRecommandes();
	}

	@Override
	public List<Book> getBookByCat(Category cat) {
		// TODO Auto-generated method stub
		return bookDao.getBookByCat(cat);
	}

	@Override
	public List<Book> getPeriodique() {
		// TODO Auto-generated method stub
		return bookDao.getPeriodique();
	}

	@Override
	public List<Book> getBookByAuthor(Author author) {
		// TODO Auto-generated method stub
		return bookDao.getBookByAuthor(author);
	}

	@Override
	public List<Book> getBookByRecherche(String recherche) {
		// TODO Auto-generated method stub
		return bookDao.getBookByRecherche(recherche);
	}

	public void insert(final Book monObjet)
	{
		bookDao.insert(monObjet);
	}
	
	
	public void delete(final Book object) {
		bookDao.delete(object);
	}
	
	public void update(final Book object) {
		bookDao.update(object);
	}
	
	public Book getById(int id) {
		return bookDao.getById(id);
	}
	
	public Book getObjectByName(String nom) {
		return bookDao.getObjectByName(nom);
	}
	
	public List<Book> getList(){
		return bookDao.getList();
	}

	

}
