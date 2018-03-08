package com.infotel.gestionbiblio.service.inter;

import java.util.List;

public interface CommonService<T> {
	
	public void insert(final T monObjet);

	public void delete(final T object); 

	public void update(final T object);

	public T getById(int id);

	public abstract T getObjectByName(String nom);

	public List<T> getList();
}
