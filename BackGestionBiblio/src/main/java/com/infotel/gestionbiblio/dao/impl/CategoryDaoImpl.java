package com.infotel.gestionbiblio.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;

import com.infotel.gestionbiblio.dao.inter.CategoryDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Category;

public class CategoryDaoImpl extends CommonDaoImpl<Category> implements CategoryDao {

	Category category;
	List<Category> categoryList;

	@Override
	public Category getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Author where categoryName=:name");
		query.setParameter("name", nom);
		category = (Category) query.uniqueResult();
		
		return category;
	}
	
	@Override
	public List<Category> getList()
	{
		categoryList = super.getList();
		return categoryList;
	}

}
 