package com.formation.infotel.springmvc.controller;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infotel.config.ConteneurSpringFullJava;
import com.infotel.gestionbiblio.dao.impl.CommonDaoImpl;
import com.infotel.gestionbiblio.dao.inter.BookDao;
import com.infotel.gestionbiblio.entity.Book;



@Controller
@RequestMapping("/")
public class AppController 
{
	@Autowired
	SessionFactory sessionFactory;

	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) 
	{
		
		return "home";
	}

	@RequestMapping(value = { "/products"}, method = RequestMethod.GET)
	public String productsPage(ModelMap model) 
	{
		
	/*	List<Book> books = new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book());
		
		ArrayList<Author> authors = new ArrayList<Author>();
		authors.get(0).setAuthorFirstname("Author First name");
		authors.get(0).setAuthorLastname("Author Last name");
		authors.get(0).setBook(books);
		
		books.get(0).setAuthor(authors);
		
		List<BookCopy> bookCopy = new ArrayList<BookCopy>();
		bookCopy.get(0).setBook(books.get(0));
		bookCopy.get(0).setBookCopyTitle("Alice aux pays des merveilles");
		
		
		books.get(0).setBookCopy(bookCopy);
		books.get(0).setBookDescription("Ceci est un livre");
		books.get(0).setBookPrice(57);
		books.get(0).setBookTitre(bookCopy.get(0).getBookCopyTitle());
		
		Catalog catalog = new catalog
		books.get(0).setCatalog(catalog);
		books.get(0).setEditor(editor);
		books.get(0).setImagePath(imagePath);
		books.get(0).setISBN(iSBN);
		books.get(0).setPopularBook(popularBook);
		books.get(0).setPublicationDate(publicationDate);
		
		books.get(1).setAuthor(author);
		books.get(1).setBookCopy(bookCopy);
		books.get(1).setBookDescription(bookDescription);
		books.get(1).setBookPrice(bookPrice);
		books.get(1).setBookTitre(bookTitre);
		books.get(1).setCatalog(catalog);
		books.get(1).setEditor(editor);
		books.get(1).setImagePath(imagePath);
		books.get(1).setISBN(iSBN);
		books.get(1).setPopularBook(popularBook);
		books.get(1).setPublicationDate(publicationDate);
		*/
		
		//model.addAttribute();
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConteneurSpringFullJava.class);
		
		BookDao book = (BookDao) ctx.getBean("bookDaoImpl");
		
		model.addAttribute("books", (List<Book>)((CommonDaoImpl) book).getList());
		
		
		return "products";
	}
	
	@RequestMapping(value = { "/products/recherche"}, method = RequestMethod.GET)
	public String productsRecherchePage(ModelMap model) 
	{
		
		return "recherche";
	}
	
	@RequestMapping(value = { "/products/auteur"}, method = RequestMethod.GET)
	public String productsAuteurPage(ModelMap model) 
	{
		
		return "auteur";
	}

	@RequestMapping(value = { "/compte"}, method = RequestMethod.GET)
	public String comptePage(ModelMap model) 
	{
		
		return "compte";
	}
	
	@RequestMapping(value = { "/deconnexion"}, method = RequestMethod.GET)
	public String deconnexionPage(ModelMap model) 
	{
		
		return "deconnexion";
	}
	
	@RequestMapping(value = { "/gestioncompte"}, method = RequestMethod.GET)
	public String gestionComptePage(ModelMap model) 
	{
		
		return "gestioncompte";
	}
	
	@RequestMapping(value = { "/inscription"}, method = RequestMethod.GET)
	public String inscriptionPage(ModelMap model) 
	{
		
		return "inscription";
	}
	
	@RequestMapping(value = { "/login"}, method = RequestMethod.GET)
	public String loginPage(ModelMap model) 
	{
		
		return "login";
	}
}