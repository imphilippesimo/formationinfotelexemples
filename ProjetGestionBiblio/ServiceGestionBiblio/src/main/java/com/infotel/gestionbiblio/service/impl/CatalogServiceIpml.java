 package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.CatalogDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.BookBasket;
import com.infotel.gestionbiblio.entity.Catalog;
import com.infotel.gestionbiblio.service.inter.CatalogService;

@Service
@Transactional
public class CatalogServiceIpml implements CatalogService{

	@Autowired
	private CatalogDao catalogDao;
	
	public void insert(final Catalog monObjet)
	{
		catalogDao.insert(monObjet);
	}
	
	
	public void delete(final Catalog object) {
		catalogDao.delete(object);
	}
	
	public void update(final Catalog object) {
		catalogDao.update(object);
	}
	
	public Catalog getById(int id) {
		return catalogDao.getById(id);
	}
	
	public Catalog getObjectByName(String nom) {
		return catalogDao.getObjectByName(nom);
	}
	
	public List<Catalog> getList(){
		return catalogDao.getList();
	}
}
