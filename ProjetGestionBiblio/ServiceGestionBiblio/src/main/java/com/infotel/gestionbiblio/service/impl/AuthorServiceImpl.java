package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.AuthorDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.service.inter.AuthorService;

@Service
@Transactional
public class AuthorServiceImpl extends CommonServiceImpl<Author> implements AuthorService{

	@Autowired
	private AuthorDao authorDao;
	
}
