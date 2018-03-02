package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.query.Query;

import com.infotel.gestionbiblio.dao.inter.LibraryDao;
import com.infotel.gestionbiblio.entity.Library;

public class LibraryDaoImpl extends CommonDaoImpl<Library> implements LibraryDao {

	Library library;
	List<Library> libraryList;

	@Override
	public Library getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Author where libraryName=:name");
		query.setParameter("name", nom);
		library = (Library) query.uniqueResult();
		
		return library;
	}
	
	@Override
	public List<Library> getList()
	{
		libraryList = super.getList();
		return libraryList;
	}

}
 