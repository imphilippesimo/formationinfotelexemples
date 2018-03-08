package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.CatalogDao;
import com.infotel.gestionbiblio.entity.Catalog;

@Repository
@Transactional
public class CatalogDaoImpl extends CommonDaoImpl<Catalog> implements CatalogDao {

	Catalog catalog;
	List<Catalog> catalogList;
	
	@Autowired
	private SessionFactory sessionFactory;

	

	@Override
	public Catalog getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Catalog where catalogName=:name");
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
 