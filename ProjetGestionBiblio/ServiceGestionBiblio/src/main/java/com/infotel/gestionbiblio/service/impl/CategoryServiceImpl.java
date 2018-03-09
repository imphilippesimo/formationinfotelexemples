 package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.CategoryDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.BookBasket;
import com.infotel.gestionbiblio.entity.Category;
import com.infotel.gestionbiblio.service.inter.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	public void insert(final Category monObjet)
	{
		categoryDao.insert(monObjet);
	}
	
	
	public void delete(final Category object) {
		categoryDao.delete(object);
	}
	
	public void update(final Category object) {
		categoryDao.update(object);
	}
	
	public Category getById(int id) {
		return categoryDao.getById(id);
	}
	
	public Category getObjectByName(String nom) {
		return categoryDao.getObjectByName(nom);
	}
	
	public List<Category> getList(){
		return categoryDao.getList();
	}
	
}
