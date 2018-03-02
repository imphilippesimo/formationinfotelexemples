package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.query.Query;

import com.infotel.gestionbiblio.dao.inter.BookDao;
import com.infotel.gestionbiblio.entity.Book;

public class BookDaoImpl extends CommonDaoImpl<Book> implements BookDao {

	Book book;
	List<Book> bookList;

	@Override
	public Book getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Author where bookTitle=:name");
		query.setParameter("name", nom);
		book = (Book) query.uniqueResult();
		
		return book;
	}
	
	@Override
	public List<Book> getList()
	{
		bookList = super.getList();
		return bookList;
	}

}
 