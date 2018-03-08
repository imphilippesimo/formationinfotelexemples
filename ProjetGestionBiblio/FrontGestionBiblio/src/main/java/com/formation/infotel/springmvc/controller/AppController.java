package com.formation.infotel.springmvc.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infotel.config.ConteneurSpringFullJava;
import com.infotel.gestionbiblio.dao.inter.BookDao;

@Controller
@Transactional
public class AppController 
{
	@Autowired
	BookDao bookDao;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {

		return "home";
	}

	@RequestMapping(value = { "/products" }, method = RequestMethod.GET)
	public String productsPage(ModelMap model) {
		/*
		 * List<Book> books = new ArrayList<Book>(); books.add(new Book());
		 * books.add(new Book());
		 * 
		 * List<Author> authors = new ArrayList<Author>(); authors.add(new Author());
		 * authors.get(0).setAuthorFirstname("Author First name");
		 * authors.get(0).setAuthorLastname("Author Last name");
		 * authors.get(0).setBook(books);
		 * 
		 * books.get(0).setAuthor(authors);
		 * 
		 * List<BookCopy> bookCopy = new ArrayList<BookCopy>(); bookCopy.add(new
		 * BookCopy()); bookCopy.get(0).setBook(books.get(0));
		 * bookCopy.get(0).setBookCopyTitle("Alice aux pays des merveilles");
		 * 
		 * 
		 * books.get(0).setBookCopy(bookCopy);
		 * books.get(0).setBookDescription("Ceci est un livre");
		 * books.get(0).setBookPrice(57);
		 * books.get(0).setBookTitre(bookCopy.get(0).getBookCopyTitle());
		 * 
		 * Catalog catalog = new Catalog("cata",books);
		 * books.get(0).setCatalog(catalog); books.get(0).setEditor(new
		 * Editor("eni","2 rue du machin", books)); books.get(0).setImagePath("/");
		 * books.get(0).setISBN(1245784518); books.get(0).setPopularBook(true);
		 * books.get(0).setPublicationDate(new Date());
		 *  
		 * catalog.setBookCatalog(books); authors.get(0).setBook(books);
		 * bookCopy.get(0).setBook(books.get(0));
		 * 
		 * books.get(1).setAuthor(authors); books.get(1).setBookCopy(bookCopy);
		 * books.get(1).setBookDescription("ceci est un description");
		 * books.get(1).setBookPrice(58.4f);
		 * books.get(1).setBookTitre("un autre livre!!");
		 * books.get(1).setCatalog(catalog); books.get(1).setEditor(new
		 * Editor("eni2","3 rue du machin", books)); books.get(1).setImagePath("/");
		 * books.get(1).setISBN(54879541); books.get(1).setPopularBook(true);
		 * books.get(1).setPublicationDate(new Date());
		 * 
		 * 
		 * model.addAttribute("books",books);
		 */

		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConteneurSpringFullJava.class);

		bookDao = (BookDao) ctx.getBean("bookDaoImpl");

		model.addAttribute("books", bookDao.getList());

		return "products";
	}

	@RequestMapping(value = { "/products/recherche" }, method = RequestMethod.GET)
	public String productsRecherchePage(ModelMap model) {

		return "recherche";
	}

	@RequestMapping(value = { "/products/auteur" }, method = RequestMethod.GET)
	public String productsAuteurPage(ModelMap model) {

		return "auteur";
	}

	@RequestMapping(value = { "/compte" }, method = RequestMethod.GET)
	public String comptePage(ModelMap model) {

		return "compte";
	}

	@RequestMapping(value = { "/deconnexion" }, method = RequestMethod.GET)
	public String deconnexionPage(ModelMap model) {

		return "deconnexion";
	}

	@RequestMapping(value = { "/gestioncompte" }, method = RequestMethod.GET)
	public String gestionComptePage(ModelMap model) {

		return "gestioncompte";
	}

	@RequestMapping(value = { "/inscription" }, method = RequestMethod.GET)
	public String inscriptionPage(ModelMap model) {

		return "inscription";
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String loginPage(ModelMap model) {

		return "login";
	}
}