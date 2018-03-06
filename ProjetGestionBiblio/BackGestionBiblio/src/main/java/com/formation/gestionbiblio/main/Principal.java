package com.formation.gestionbiblio.main;

//import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infotel.config.ConteneurSpringFullJava;
import com.infotel.gestionbiblio.dao.inter.*;


public class Principal 
{

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConteneurSpringFullJava.class);
		
	//	Date madate = new Date();
		
	//	Book book = new Book();
		BookDao book = (BookDao) ctx.getBean("bookDaoImpl");
	//	Book book2 = new Book();
		BookDao book2 = (BookDao) ctx.getBean("bookDaoImpl");
	//	List<Book> books = new ArrayList<Book>();
		
	//	books.add((Book) book);
	//	books.add((Book) book2);
		
		MemberDao member = (MemberDao) ctx.getBean("memberDaoImpl");
		MemberDao member2 = (MemberDao) ctx.getBean("memberDaoImpl");
	//	Member member = new Member();
	//	Member member2 = new Member();
	//	List<Member> members = new ArrayList<Member>();
		
	//	members.add((Member) member);
	//	members.add((Member) member2);
		
		
		BookCopyDao bookCopy = (BookCopyDao) ctx.getBean("bookCopyDaoImpl");
		BookCopyDao bookCopy2 = (BookCopyDao) ctx.getBean("bookCopyDaoImpl");
//		BookCopy bookCopy = new BookCopy();
	//	BookCopy bookCopy2 = new BookCopy();
	//	List<BookCopy> bookCopys = new ArrayList<BookCopy>();
		
	//	bookCopys.add((BookCopy) bookCopy);
	//	bookCopys.add((BookCopy) bookCopy2);
		
		
		AuthorDao author = (AuthorDao) ctx.getBean("authorDaoImpl");
	//	Author author = new Author("Hugo","Victo",books);
		
	//	BookBasket bookBasket = new BookBasket(madate,madate,bookCopys,members);
		BookBasketDao bookBasket = (BookBasketDao) ctx.getBean("bookBasketDaoImpl");
		

		BookshelfDao bookshelf = (BookshelfDao) ctx.getBean("bookshelfDaoImpl");
	//	Bookshelf bookshelf = new Bookshelf("etagere 1","c'est la premiere",2,bookCopys);
		
		BorrowDao borrow = (BorrowDao) ctx.getBean("borrowDaoImpl");
	//	Borrow borrow = new Borrow(madate,madate,bookCopy,member);
		

		CatalogDao catalog = (CatalogDao) ctx.getBean("catalogDaoImpl");
		CatalogDao catalog2 = (CatalogDao) ctx.getBean("catalogDaoImpl");
	//	Catalog catalog = new Catalog("catalogue",books);
	//	Catalog catalog2 = new Catalog("catalogue",books);
	//	List<Catalog> catalogs = new ArrayList<Catalog>();
		
	//	catalogs.add((Catalog) catalog);
	//	catalogs.add((Catalog) catalog);

		RegistrationDao registration = (RegistrationDao) ctx.getBean("registrationDaoImpl");
	//	Registration registration = new Registration(madate,members);
		
		
		LibraryDao library = (LibraryDao) ctx.getBean("libraryDaoImpl");
	//	Library library = new Library(1,"ma library","11 rue du bi", catalogs ,registration);
		
		CategoryDao category = (CategoryDao) ctx.getBean("categoryDaoImpl");
	//	Category category = new Category("toto","la categ de sblagues a toto",books);
		
		EditorDao editor = (EditorDao) ctx.getBean("editorDaoImpl");
	//	Editor editor = new Editor("al","14fir pasfuaj",books);

	
	
		
		System.out.println("ok");

	}

}
