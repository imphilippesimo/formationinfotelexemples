package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookshelfDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Bookshelf;
import com.infotel.gestionbiblio.service.inter.BookselfService;

@Service
@Transactional
public class BookshelfServiceImpl extends CommonServiceImpl<Bookshelf> implements BookselfService {
	@Autowired
	private BookshelfDao bookshelfDao;

}
