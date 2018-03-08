package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.CommonDAO;

@Service
@Transactional
public class CommonServiceImpl<T> {

	@Autowired
	private CommonDAO<T> commonDAO;
	
	public void insert(final T monObjet){
		commonDAO.insert(monObjet);
	}
	
	
	public void delete(final T object) {
		commonDAO.delete(object);
	}
	
	public void update(final T object) {
		commonDAO.update(object);
	}
	
	public T getById(int id) {
		return commonDAO.getById(id);
	}
	
	public T getObjectByName(String nom) {
		return commonDAO.getObjectByName(nom);
	}
	
	public List<T> getList(){
		return commonDAO.getList();
	}
	
}
