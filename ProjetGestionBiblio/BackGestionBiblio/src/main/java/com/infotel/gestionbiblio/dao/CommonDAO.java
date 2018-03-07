package com.infotel.gestionbiblio.dao;

import java.util.List;


public interface CommonDAO<T> 
{
 
	public void insert(final T monObjet);

	public void delete(final T object); 

	public void update(final T object);

	public T getById(int id);

	public abstract T getObjectByName(String nom);

	public List<T> getList();


}
