package com.infotel.gestionbiblio.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;

import com.infotel.gestionbiblio.dao.inter.BookBasketDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.BookBasket;

public class BookBasketDaoImpl extends CommonDaoImpl<BookBasket> implements BookBasketDao {

	BookBasket bookBasket;
	List<BookBasket> bookBasketList;
	
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
 