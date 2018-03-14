package com.infotel.gestionbiblio.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.gestionbiblio.dao.inter.BookDao;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.Catalog;
import com.infotel.gestionbiblio.entity.Category;
import com.infotel.gestionbiblio.service.inter.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	public void insert(final Book monObjet) {
		bookDao.insert(monObjet);
	}

	public void delete(final Book object) {
		bookDao.delete(object);
	}

	public void update(final Book object) {
		bookDao.update(object);
	}

	public Book getById(int id) {
		return bookDao.getById(id);
	}

	public Book getObjectByName(String nom) {
		return bookDao.getObjectByName(nom);
	}

	public List<Book> getList() {
		return bookDao.getList();
	}

	@Override
	public List<Book> getListLivreTitreFilter(List<Book> listBook, String titre) {
		List<Book> listeFiltre = new ArrayList<Book>();

		for (Book book : listBook) {
			if (book.getBookTitre().contains(titre)) {
				listeFiltre.add(book);
			}
		}
		return listeFiltre;
	}

	@Override
	public List<Book> getListLivreAuthorFilter(List<Book> listBook, String[] listeIdAuthor) {
		List<Book> listeFiltre = new ArrayList<Book>();

		for (Book book : listBook) {
			for (Author author : book.getAuthor()) {
				for (String id : listeIdAuthor) {
					if (author.getAuthorId() == Integer.parseInt(id)) {
						listeFiltre.add(book);
						continue;
					}
				}
			}
		}
		return listeFiltre;
	}

	@Override
	public List<Book> getListLivreCategoryFilter(List<Book> listBook, String[] listeIdCategory) {
		List<Book> listeFiltre = new ArrayList<Book>();

		for (Book book : listBook) {
			for (String id : listeIdCategory) {
				if (book.getCategory().getCategoryId() == Integer.parseInt(id)) {
					listeFiltre.add(book);
					continue;
				}
			}
		}
		return listeFiltre;
	}

	@Override
	public List<Book> getListLivreEditorFilter(List<Book> listBook, String[] listeIdEditor) {
		List<Book> listeFiltre = new ArrayList<Book>();

		for (Book book : listBook) {
			for (String id : listeIdEditor) {
				if (book.getEditor().getEditorId() == Integer.parseInt(id)) {
					listeFiltre.add(book);
					continue;
				}
			}

		}
		return listeFiltre;
	}

	@Override
	public List<Book> getBookRecommandes(List<Book> listBook) 
	{
		List<Book> listeFiltre = new ArrayList<Book>();

		for (Book book : listBook) 
		{
			if (book.isPopularBook()) 
			{
				listeFiltre.add(book);
			}
		}
		return listeFiltre;
	}

	@Override
	public List<Book> getPeriodique(List<Book> listBook) 
	{
		List<Book> listeFiltre = new ArrayList<Book>();

		for (Book book : listBook) {
			if (book.isPeriodicBook()) {
				listeFiltre.add(book);
			}
		}
		return listeFiltre;
	}

	@Override
	public List<Book> getBookByRecherche(List<Book> listBook, String recherche) 
	{
		List<Book> listeFiltre = new ArrayList<Book>();

		for (Book book : listBook) 
		{
			if (book.getBookTitre().contains(recherche)) 
			{
				listeFiltre.add(book);
			}
			else if (book.getBookDescription().contains(recherche))
			{
				listeFiltre.add(book);
			}
		}
		return listeFiltre;
	}

}
