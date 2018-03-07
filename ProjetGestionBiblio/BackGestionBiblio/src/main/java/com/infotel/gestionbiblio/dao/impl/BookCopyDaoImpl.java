package com.infotel.gestionbiblio.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookCopyDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.BookCopy;

@Repository
@Transactional
public class BookCopyDaoImpl extends CommonDaoImpl<BookCopy> implements BookCopyDao {

	BookCopy bookCopy;
	List<BookCopy> bookCopyList;
	
	@Autowired
	private SessionFactory sessionFactory;


	
	@Override
	public BookCopy getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Author where bookCopyTitle=:name");
		query.setParameter("name", nom);
		bookCopy = (BookCopy) query.uniqueResult();
		
		return bookCopy;
	}
	
	@Override
	public List<BookCopy> getList()
	{
		bookCopyList = super.getList();
		return bookCopyList;
	}

}
 