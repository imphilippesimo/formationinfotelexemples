package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.query.Query;

import com.infotel.gestionbiblio.dao.inter.CatalogDao;
import com.infotel.gestionbiblio.entity.Catalog;

public class CatalogDaoImpl extends CommonDaoImpl<Catalog> implements CatalogDao {

	Catalog catalog;
	List<Catalog> catalogList;

	@Override
	public Catalog getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Author where catalogName=:name");
		query.setParameter("name", nom);
		catalog = (Catalog) query.uniqueResult();
		
		return catalog;
	}
	
	@Override
	public List<Catalog> getList()
	{
		catalogList = super.getList();
		return catalogList;
	}

}
 