package com.infotel.gestionbiblio.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.CommonDAO;

@Repository
@Transactional
public class CommonDaoImpl<T> implements CommonDAO<T> 
{
	 
	@Autowired
	SessionFactory sessionFactory;
		
    public CommonDaoImpl() 
    {
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
		sessionFactory.getCurrentSession().update(object);
	}

	public T getById(int id) 
	{
		return sessionFactory.getCurrentSession().get(getEntityName() , id);
	}

	public T getObjectByName(String nom)
	{
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<T> getList() 
	{ 
	
		return (List<T>)sessionFactory.getCurrentSession().createQuery( "from " + getEntityName().getSimpleName()  ).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	private Class<T> getEntityName() {
		return ((Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}
	
	

}
