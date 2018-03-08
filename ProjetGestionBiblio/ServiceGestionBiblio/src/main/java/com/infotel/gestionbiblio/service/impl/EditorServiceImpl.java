package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.EditorDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.BookBasket;
import com.infotel.gestionbiblio.entity.Editor;
import com.infotel.gestionbiblio.service.inter.EditorService;

@Service
@Transactional
public class EditorServiceImpl implements EditorService{

	@Autowired
	private EditorDao editorDao;
	
	public void insert(final Editor monObjet)
	{
		editorDao.insert(monObjet);
	}
	
	
	public void delete(final Editor object) {
		editorDao.delete(object);
	}
	
	public void update(final Editor object) {
		editorDao.update(object);
	}
	
	public Editor getById(int id) {
		return editorDao.getById(id);
	}
	
	public Editor getObjectByName(String nom) {
		return editorDao.getObjectByName(nom);
	}
	
	public List<Editor> getList(){
		return editorDao.getList();
	}
}
