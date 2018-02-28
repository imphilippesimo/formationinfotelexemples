package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.infotel.gestionbiblio.dao.CommonDAO;

public class CommonDaoImpl<T> extends CommonDAO<T> {

	 private Class<T> type;
	 
	@Autowired
	SessionFactory sessionF;
 
	@Override
	public void insert(T monObjet) {
		sessionF.getCurrentSession().save(monObjet);
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	T getObjectByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	List<T> getList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
