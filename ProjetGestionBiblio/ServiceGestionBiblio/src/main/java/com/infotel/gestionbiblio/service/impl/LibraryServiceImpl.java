 package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.LibraryDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.BookBasket;
import com.infotel.gestionbiblio.entity.Library;
import com.infotel.gestionbiblio.service.inter.LibraryService;

@Service
@Transactional
public class LibraryServiceImpl implements LibraryService{

	@Autowired
	private LibraryDao libraryDao;
	
	public void insert(final Library monObjet)
	{
		libraryDao.insert(monObjet);
	}
	
	
	public void delete(final Library object) {
		libraryDao.delete(object);
	}
	
	public void update(final Library object) {
		libraryDao.update(object);
	}
	
	public Library getById(int id) {
		return libraryDao.getById(id);
	}
	
	public Library getObjectByName(String nom) {
		return libraryDao.getObjectByName(nom);
	}
	
	public List<Library> getList(){
		return libraryDao.getList();
	}
}
