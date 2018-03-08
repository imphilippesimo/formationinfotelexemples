package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookDao;
import com.infotel.gestionbiblio.dao.inter.BorrowDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Borrow;
import com.infotel.gestionbiblio.service.inter.BookService;
import com.infotel.gestionbiblio.service.inter.BorrowService;

@Service
@Transactional
public class BorrowServiceImpl extends CommonServiceImpl<Borrow> implements BorrowService{
	
	@Autowired
	private BorrowDao borrowDao;
	
	@Autowired
	private BookService bookService;
	
	
	

}
