package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.query.Query;

import com.infotel.gestionbiblio.dao.inter.AuthorDao;
import com.infotel.gestionbiblio.entity.Author;

public class AuthorDaoImpl extends CommonDaoImpl<Author> implements AuthorDao 
{
	Author author;
	List<Author> authorsList;

	@Override
	public Author getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Author where lastName=:name");
		query.setParameter("name", nom);
		author = (Author) query.uniqueResult();
		
		return author;
	}
	
	@Override
	public List<Author> getList()
	{
		authorsList = super.getList();
		return authorsList;
	}

} 
