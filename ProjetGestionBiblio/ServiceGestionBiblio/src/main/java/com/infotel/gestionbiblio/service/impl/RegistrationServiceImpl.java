 package com.infotel.gestionbiblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.RegistrationDao;
import com.infotel.gestionbiblio.entity.Registration;
import com.infotel.gestionbiblio.service.inter.RegistrationService;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired 
	private RegistrationDao registrationDao;
	
	public void insert(final Registration monObjet)
	{
		registrationDao.insert(monObjet);
	}
	
	
	public void delete(final Registration object) {
		registrationDao.delete(object);
	}
	
	public void update(final Registration object) {
		registrationDao.update(object);
	}
	
	public Registration getById(int id) {
		return registrationDao.getById(id);
	}
	
	public Registration getObjectByName(String nom) {
		return registrationDao.getObjectByName(nom);
	}
	
	public List<Registration> getList(){
		return registrationDao.getList();
	}
}
