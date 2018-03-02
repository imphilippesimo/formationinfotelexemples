package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import com.infotel.gestionbiblio.dao.inter.RegistrationDao;
import com.infotel.gestionbiblio.entity.Registration;

public class RegistrationDaoImpl extends CommonDaoImpl<Registration> implements RegistrationDao 
{
	Registration registration;
	List<Registration> registrationList;

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
 