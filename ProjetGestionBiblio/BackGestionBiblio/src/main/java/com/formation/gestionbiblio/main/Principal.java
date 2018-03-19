package com.formation.gestionbiblio.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infotel.config.ConteneurSpringFullJava;
import com.infotel.gestionbiblio.dao.inter.*;
import com.infotel.gestionbiblio.entity.*;


public class Principal 
{

	
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConteneurSpringFullJava.class);
		
//		Date madate = new Date();
		
//		Book book = new Book();
		BookDao bookDao = (BookDao) ctx.getBean("bookDaoImpl");
//		Book book2 = new Book();
//		List<Book> books = new ArrayList<Book>();
		
//		books.add((Book) book);
//		books.add((Book) book2);
		
		MemberDao memberDao = (MemberDao) ctx.getBean("memberDaoImpl");
		MemberDao memberDao2 = (MemberDao) ctx.getBean("memberDaoImpl");
//		Member member = new Member();
//		Member member2 = new Member();
//		List<Member> members = new ArrayList<Member>();
		
//		members.add((Member) member);
//		members.add((Member) member2);
		
		
		BookCopyDao bookCopyDao = (BookCopyDao) ctx.getBean("bookCopyDaoImpl");
		BookCopyDao bookCopyDao2 = (BookCopyDao) ctx.getBean("bookCopyDaoImpl");
//		BookCopy bookCopy = new BookCopy();
//		BookCopy bookCopy2 = new BookCopy();
//		List<BookCopy> bookCopys = new ArrayList<BookCopy>();
		
//		bookCopys.add((BookCopy) bookCopy);
//		bookCopys.add((BookCopy) bookCopy2);
		
		
		AuthorDao authorDao = (AuthorDao) ctx.getBean("authorDaoImpl");
//		Author author = new Author();
//		Author author2 = new Author();
//		List<Author> authors = new ArrayList<Author>();
		
////		BookBasket bookBasket = new BookBasket();
		BookBasketDao bookBasketDao = (BookBasketDao) ctx.getBean("bookBasketDaoImpl");
		

		BookshelfDao bookshelfDao = (BookshelfDao) ctx.getBean("bookshelfDaoImpl");
//		Bookshelf bookshelf = new Bookshelf("etagere 1","c'est la premiere",2,bookCopys);
		
		BorrowDao borrowDao = (BorrowDao) ctx.getBean("borrowDaoImpl");
//		Borrow borrow = new Borrow();
		
		


		RegistrationDao registrationDao = (RegistrationDao) ctx.getBean("registrationDaoImpl");
//		Registration registration = new Registration();
//		Registration registration2 = new Registration();
//		List<Registration> registrations = new ArrayList<Registration>();
//		registrations.add(registration);
//		registrations.add(registration2);
		
		
		LibraryDao libraryDao = (LibraryDao) ctx.getBean("libraryDaoImpl");
//		Library library = new Library();
		
		CategoryDao categoryDao = (CategoryDao) ctx.getBean("categoryDaoImpl");
//		Category category = new Category();
		
		EditorDao editorDao = (EditorDao) ctx.getBean("editorDaoImpl");
//		Editor editor = new Editor();


/*		books.get(0).setBookDescription("Description du livre 1");
		books.get(0).setBookPrice(57.1f);
		books.get(0).setBookTitre("Titre1");
		books.get(0).setImagePath("/");
		books.get(0).setISBN(1245877);
		books.get(0).setPeriodicBook(true);
		books.get(0).setPopularBook(true);
		books.get(0).setPublicationDate(madate);
		

		books.get(1).setBookDescription("Description du livre 2");
		books.get(1).setBookPrice(47.1f);
		books.get(1).setBookTitre("Titre2");
		books.get(1).setImagePath("/");
		books.get(1).setISBN(654789);
		books.get(1).setPeriodicBook(true);
		books.get(1).setPopularBook(true);
		books.get(1).setPublicationDate(madate);
		
		*/
		

		
	/*	editor.setBookEditor(books);
		editor.setEditorAddress("16 rue de l'editeur");
		editor.setEditorName("ENI");
		
		author.setAuthorFirstname("Victor");
		author.setAuthorLastname("HUGO");
		author.setBook(books);
		
		category.setBookCategory(books);
		category.setCategoryDescription("Cat Divers");
		category.setCategoryName("1ere catégorie");*/
		
	/*	member.setAdministrateur(true);
		member.setBookBasket(bookBaskets);
		member.setBorrow(borrows);
		member.setMemberAddress("56 rue du membre 1");
		member.setMemberCity("Renne");
		member.setMemberEmail("membre1@mail.com");
		member.setMemberFirstname("");
		member.setMemberLastname(memberLastname);
		member.setMemberPassword(memberPassword);
		member.setMemberPhone(memberPhone);
		member.setMemberPostalCode(memberPostalCode);
		member.setRegistration(registrations);*/
		
	/*	registrationDao.insert(registration);
		registrationDao.insert(registration2);
		
		library.setLibraryAddress("84 rue de la bibliotheque");
		library.setLibraryCode(154879);
		library.setLibraryName("Biblio Tech");
		library.setRegistrations(registrations);
		
		books.get(0).setAuthor(authors);
		books.get(0).setBookCopy(bookCopys);
		books.get(0).setCategory(category);
		books.get(0).setEditor(editor);
		books.get(0).setLibrary(library);
		
		books.get(1).setAuthor(authors);
		books.get(1).setBookCopy(bookCopys);
		books.get(1).setCategory(category);
		books.get(1).setEditor(editor);
		books.get(1).setLibrary(library);*/
		/*
		libraryDao.insert(library);
		
		editorDao.insert(editor);
		
		categoryDao.insert(category);*/
		
	/*	bookDao.insert(books.get(0));
		bookDao.insert(books.get(1));*/
	
		
		System.out.println("ok");

	}

}
