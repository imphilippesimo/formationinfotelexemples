package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.CatalogDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Catalog;
import com.infotel.gestionbiblio.service.inter.CatalogService;

@Service
@Transactional
public class CatalogServiceIpml extends CommonServiceImpl<Catalog> implements CatalogService{

	@Autowired
	private CatalogDao catalogDao;
}
