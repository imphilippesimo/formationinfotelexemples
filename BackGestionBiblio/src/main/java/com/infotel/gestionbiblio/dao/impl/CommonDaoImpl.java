package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.infotel.gestionbiblio.dao.CommonDAO;

public abstract class CommonDaoImpl<T> implements CommonDAO<T> {

	 
	 
	@Autowired
	SessionFactory sessionFactory;
	
	private Class<T> type;
	
    public CommonDaoImpl() 
    {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }
 
	public void insert(final T monObjet) 
	{
		sessionFactory.getCurrentSession().save(monObjet);
		
	}

	public void delete(final T object) 
	{
		sessionFactory.getCurrentSession().delete(object);
	}

	public void update(final T object)
	{
		sessionFactory.getCurrentSession().delete(object);
	}

	public T getById(int id) 
	{
		return sessionFactory.getCurrentSession().get(type, id);
	}

	public abstract T getObjectByName(String nom);

	public List<T> getList() 
	{
		List<T> list=sessionFactory.getCurrentSession().createQuery("from Product").getResultList();
		return list;
	}
	
	

}
