package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.LibraryDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Library;
import com.infotel.gestionbiblio.service.inter.LibraryService;

@Service
@Transactional
public class LibraryServiceImpl extends CommonServiceImpl<Library> implements LibraryService{

	@Autowired
	private LibraryDao libraryDao;
}
