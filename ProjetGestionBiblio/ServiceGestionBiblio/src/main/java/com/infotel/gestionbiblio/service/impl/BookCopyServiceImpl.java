package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookCopyDao;
import com.infotel.gestionbiblio.entity.BookCopy;
import com.infotel.gestionbiblio.service.inter.BookCopyService;

@Service
@Transactional
public class BookCopyServiceImpl implements BookCopyService {
	@Autowired
	private BookCopyDao bookCopyDao;
	 
	public void insert(final BookCopy monObjet)
	{
		bookCopyDao.insert(monObjet);
	}
	
	
	public void delete(final BookCopy object) {
		bookCopyDao.delete(object);
	}
	
	public void update(final BookCopy object) {
		bookCopyDao.update(object);
	}
	
	public BookCopy getById(int id) {
		return bookCopyDao.getById(id);
	}
	
	public BookCopy getObjectByName(String nom) {
		return bookCopyDao.getObjectByName(nom);
	}
	
	public List<BookCopy> getList(){
		return bookCopyDao.getList();
	}
}
