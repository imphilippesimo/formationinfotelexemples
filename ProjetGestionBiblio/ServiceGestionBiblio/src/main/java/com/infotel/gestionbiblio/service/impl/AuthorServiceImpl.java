package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.CommonDAO;
import com.infotel.gestionbiblio.dao.inter.AuthorDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.service.inter.AuthorService;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	private AuthorDao authorDao;

	 
	public void insert(final Author monObjet)
	{
		authorDao.insert(monObjet);
	}
	
	
	public void delete(final Author object) {
		authorDao.delete(object);
	}
	
	public void update(final Author object) {
		authorDao.update(object);
	}
	
	public Author getById(int id) {
		return authorDao.getById(id);
	}
	
	public Author getObjectByName(String nom) {
		return authorDao.getObjectByName(nom);
	}
	
	public List<Author> getList(){
		return authorDao.getList();
	}
	
}
