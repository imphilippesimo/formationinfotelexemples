package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.CategoryDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Category;
import com.infotel.gestionbiblio.service.inter.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl extends CommonServiceImpl<Category> implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	
}
