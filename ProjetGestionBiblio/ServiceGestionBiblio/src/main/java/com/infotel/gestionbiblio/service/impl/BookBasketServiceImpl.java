package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookBasketDao;
import com.infotel.gestionbiblio.entity.BookBasket;
import com.infotel.gestionbiblio.service.inter.BookBasketService;

@Service
@Transactional
public class BookBasketServiceImpl implements BookBasketService {
	@Autowired
	private BookBasketDao bookBasketDao;
 
	
	public void insert(final BookBasket monObjet)
	{
		bookBasketDao.insert(monObjet);
	}
	
	
	public void delete(final BookBasket object) {
		bookBasketDao.delete(object);
	}
	
	public void update(final BookBasket object) {
		bookBasketDao.update(object);
	}
	
	public BookBasket getById(int id) {
		return bookBasketDao.getById(id);
	}
	
	public BookBasket getObjectByName(String nom) {
		return bookBasketDao.getObjectByName(nom);
	}
	
	public List<BookBasket> getList(){
		return bookBasketDao.getList();
	}
}
