package com.infotel.gestionbiblio.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.Category;

@Repository
@Transactional
public class BookDaoImpl extends CommonDaoImpl<Book> implements BookDao {

	Book book;
	List<Book> bookList;
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Book getObjectByName(String nom) 
	{
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from Author where bookTitle=:name");
		query.setParameter("name", nom);
		book = (Book) query.uniqueResult();
		
		return book;
	}
	
	@Override
	public List<Book> getList()
	{
		bookList = super.getList();
		return bookList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Book>getBookRecommandes(){
		return (List<Book>)sessionFactory.getCurrentSession().createQuery("FROM Book B WHERE B.popularBook=1").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Book>getBookByCat(Category cat){
		return (List<Book>)sessionFactory.getCurrentSession().createQuery("FROM Book B WHERE B.category=:cat").setParameter("cat", cat).getResultList();
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Book>getPeriodique(){
		return(List<Book>)sessionFactory.getCurrentSession().createQuery("FROM Book B WHERE B.periodicBook=1").getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Book>getBookByAuthor(Author author){
		return(List<Book>)sessionFactory.getCurrentSession().createQuery("FROM Book B WHERE L.author=:author ORDER BY L.bookTitre").setParameter("author", author).getResultList();
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Book>getBookByRecherche(String recherche){
		return(List<Book>)sessionFactory.getCurrentSession().createQuery("FROM Book B WHERE L.bookTitre LIKE :recherche OR L.bookDescription LIKE :recherche").setParameter("recherche", "%" + recherche + "%").getResultList();
	}
}
 