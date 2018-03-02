package com.infotel.gestionbiblio.dao.impl;


import java.util.List;

import com.infotel.gestionbiblio.dao.inter.BorrowDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Borrow;

public class BorrowDaoImpl extends CommonDaoImpl<Borrow> implements BorrowDao 
{
	Borrow borrow;
	List<Borrow> borrowList;

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
 