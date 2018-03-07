package com.infotel.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			
			System.out.println(sessionFactory.toString());
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
	public static void shutdown()
	{
		getSessionFactory().close();
	}
}
