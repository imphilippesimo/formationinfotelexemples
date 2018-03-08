package com.infotel.gestionbiblio.dao.impl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BorrowDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.Borrow;

@Repository
@Transactional
public class BorrowDaoImpl extends CommonDaoImpl<Borrow> implements BorrowDao 
{
	Borrow borrow;
	List<Borrow> borrowList;
	
	@Autowired
	private SessionFactory sessionFactory;

	
	

	@Override
	public Borrow getObjectByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Borrow> getList()
	{
		borrowList = super.getList();
		return borrowList;
	}

}
 