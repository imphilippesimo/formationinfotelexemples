package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.AuthorDao;
import com.infotel.gestionbiblio.entity.Author;

@Repository
@Transactional
public class AuthorDaoImpl extends CommonDaoImpl<Author> implements AuthorDao 
{
	Author author;
	List<Author> authorsList;
	
	@Autowired
	private SessionFactory sessionFactory;


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
