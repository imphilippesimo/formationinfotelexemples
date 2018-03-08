package com.infotel.gestionbiblio.dao.impl;

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
	
	private Class<T> type;
	
	
	
    public CommonDaoImpl() 
    {
   /*     Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;*/
        type = (Class) this.getClass();
        System.out.println(type);
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
		return sessionFactory.getCurrentSession().get(type, id);
	}

	public T getObjectByName(String nom)
	{
		return null;
	}

	public List<T> getList() 
	{
		return (List<T>)sessionFactory.getCurrentSession().createQuery( "from " + type.getName() ).getResultList();
	}
	
	

}
