package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.infotel.gestionbiblio.dao.inter.BookshelfDao;
import com.infotel.gestionbiblio.entity.Bookshelf;

@Repository
public class BookshelfDaoImpl extends CommonDaoImpl<Bookshelf> implements BookshelfDao {

	Bookshelf bookshelf;
	List<Bookshelf> bookshelfList;

	@Override
	public Bookshelf getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Author where bookshelfName=:name");
		query.setParameter("name", nom);
		bookshelf = (Bookshelf) query.uniqueResult();
		
		return bookshelf;
	}
	
	@Override
	public List<Bookshelf> getList()
	{
		bookshelfList = super.getList();
		return bookshelfList;
	}

}
 