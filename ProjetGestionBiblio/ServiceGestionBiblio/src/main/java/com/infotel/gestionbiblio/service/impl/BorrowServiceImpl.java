 package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BorrowDao;
import com.infotel.gestionbiblio.entity.Borrow;
import com.infotel.gestionbiblio.service.inter.BorrowService;

@Service
@Transactional
public class BorrowServiceImpl implements BorrowService{
	
	@Autowired
	private BorrowDao borrowDao;	
	
	public void insert(final Borrow monObjet)
	{
		borrowDao.insert(monObjet);
	}
	
	
	public void delete(final Borrow object) {
		borrowDao.delete(object);
	}
	
	public void update(final Borrow object) {
		borrowDao.update(object);
	}
	
	public Borrow getById(int id) {
		return borrowDao.getById(id);
	}
	
	public Borrow getObjectByName(String nom) {
		return borrowDao.getObjectByName(nom);
	}
	
	public List<Borrow> getList(){
		return borrowDao.getList();
	}

}
