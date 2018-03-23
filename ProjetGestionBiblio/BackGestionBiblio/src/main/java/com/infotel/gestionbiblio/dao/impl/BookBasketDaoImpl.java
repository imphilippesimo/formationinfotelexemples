package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookBasketDao;
import com.infotel.gestionbiblio.entity.BookBasket;

@Repository
@Transactional
public class BookBasketDaoImpl extends CommonDaoImpl<BookBasket> implements BookBasketDao {

	BookBasket bookBasket;
	List<BookBasket> bookBasketList;
	
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public BookBasket getObjectByName(String nom) 
	{
		return null;
	}
	
	@Override
	public List<BookBasket> getList()
	{
		bookBasketList = super.getList();
		return bookBasketList;
	}

}
 