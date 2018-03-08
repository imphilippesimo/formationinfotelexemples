package com.infotel.gestionbiblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.RegistrationDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Registration;
import com.infotel.gestionbiblio.service.inter.RegistrationService;

@Service
@Transactional
public class RegistrationServiceImpl extends CommonServiceImpl<Registration> implements RegistrationService{

	@Autowired 
	private RegistrationDao registrationDao;
	
}
