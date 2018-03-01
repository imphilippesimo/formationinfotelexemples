package com.infotel.gestionbiblio.dao;

import java.util.List;


public abstract class CommonDAO<T> 
{
	 
	public abstract  void insert(T t);
	
	public abstract  void delete();

	public abstract  void update();

	public abstract  T getById(int id);

	public abstract T getObjectByName(String nom);

	public abstract List<T> getList();

}
