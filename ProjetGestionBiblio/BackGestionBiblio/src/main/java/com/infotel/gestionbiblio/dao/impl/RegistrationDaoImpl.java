package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.RegistrationDao;
import com.infotel.gestionbiblio.entity.Registration;

@Repository
@Transactional
public class RegistrationDaoImpl extends CommonDaoImpl<Registration> implements RegistrationDao 
{
	Registration registration;
	List<Registration> registrationList;
	
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public Registration getObjectByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Registration> getList()
	{
		registrationList = super.getList();
		return registrationList;
	}

}
 