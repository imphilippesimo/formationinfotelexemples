package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookBasketDao;

import com.infotel.gestionbiblio.entity.BookBasket;
import com.infotel.gestionbiblio.service.inter.BookBasketService;

@Service
@Transactional
public class BookBasketServiceImpl extends CommonServiceImpl<BookBasket> implements BookBasketService {
	@Autowired
	private BookBasketDao bookBasketDao;

}
