package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookCopyDao;

import com.infotel.gestionbiblio.entity.BookCopy;
import com.infotel.gestionbiblio.service.inter.BookCopyService;

@Service
@Transactional
public class BookCopyServiceImpl extends CommonServiceImpl<BookCopy> implements BookCopyService {
	@Autowired
	private BookCopyDao bookCopyDao;
}
