package com.infotel.gestionbiblio.service.inter;


import java.util.List;

import com.infotel.gestionbiblio.entity.Bookshelf;
import com.infotel.gestionbiblio.entity.Registration;

public interface RegistrationService {
	public void insert(final Registration monObjet);
	public void delete(final Registration object);
	public void update(final Registration object);
	public Registration getById(int id);
	public Registration getObjectByName(String nom) ;
	public List<Registration> getList();
}
