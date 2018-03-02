package com.formation.gestionbiblio.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.infotel.gestionbiblio.entity.*;

public class Principal 
{

	public static void main(String[] args) 
	{
		Date madate = new Date();
		Book book = new Book();
		Book book2 = new Book();
		List<Book> books = new ArrayList<Book>();
		
		books.add(book);
		books.add(book2);
		
		Member member = new Member();
		Member member2 = new Member();
		List<Member> members = new ArrayList<Member>();
		
		members.add(member);
		members.add(member2);
		
		BookCopy bookCopy = new BookCopy();
		BookCopy bookCopy2 = new BookCopy();
		List<BookCopy> bookCopys = new ArrayList<BookCopy>();
		
		books.add(book);
		books.add(book2);
		
		Author author = new Author("Hugo","Victo",books);
		
		BookBasket bookBasket = new BookBasket(madate,madate,bookCopys,members);
		


		Bookshelf bookshelf = new Bookshelf("etagere 1","c'est la premiere",2,bookCopys);
		
		Borrow borrow = new Borrow(madate,madate,bookCopy,member);
		
		BorrowPK borrowPK = new BorrowPK(1,1);
		
		Catalog catalog = new Catalog("catalogue",books);
		Catalog catalog2 = new Catalog("catalogue",books);
		List<Catalog> catalogs = new ArrayList<Catalog>();
		
		books.add(book);
		books.add(book2);

		Registration registration = new Registration(madate,members);
		
		Library library = new Library(1,"ma library","11 rue du bi", catalogs ,registration);
		
		
		Category category = new Category("toto","la categ de sblagues a toto",books);
		Editor editor = new Editor("al","14fir pasfuaj",books);


		
		System.out.println("ok");

	}

}
