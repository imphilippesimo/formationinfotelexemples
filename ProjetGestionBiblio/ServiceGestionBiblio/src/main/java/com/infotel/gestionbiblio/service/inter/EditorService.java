 package com.infotel.gestionbiblio.service.inter;



import java.util.List;

import com.infotel.gestionbiblio.entity.Editor;

public interface EditorService {
	public void insert(final Editor monObjet);
	public void delete(final Editor object);
	public void update(final Editor object);
	public Editor getById(int id);
	public Editor getObjectByName(String nom) ;
	public List<Editor> getList();
}
