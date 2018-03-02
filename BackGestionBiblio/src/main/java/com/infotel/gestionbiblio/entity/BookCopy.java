package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class BookCopy implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int idBookCopy;
	private String bookCopyTitle;

	@ManyToOne
	private Book book;
	@ManyToOne
	private Bookshelf bookshelf;
	@ManyToOne
	private BookBasket bookBasket;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="personne")
	private List<Borrow> borrows = new ArrayList<Borrow>();
	


	public BookCopy() {
		// TODO Auto-generated constructor stub
	}

	public BookCopy(String bookCopyTitle, Book book, Bookshelf bookshelf, BookBasket bookBasket, List<Borrow> borrow) {
		this.bookCopyTitle = bookCopyTitle;
		this.book = book;
		this.bookshelf = bookshelf;
		this.bookBasket = bookBasket;
		this.borrows = borrow;
	}

	public int getIdBookCopy() {
		return idBookCopy;
	}

	public void setBookCopyId(int bookCopyId) {
		this.idBookCopy = bookCopyId;
	}

	public String getBookCopyTitle() {
		return bookCopyTitle;
	}

	public void setBookCopyTitle(String bookCopyTitle) {
		this.bookCopyTitle = bookCopyTitle;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Bookshelf getBookshelf() {
		return bookshelf;
	}

	public void setBookshelf(Bookshelf bookshelf) {
		this.bookshelf = bookshelf;
	}

	public BookBasket getBookBasket() {
		return bookBasket;
	}

	public void setBookBasket(BookBasket bookBasket) {
		this.bookBasket = bookBasket;
	}

	public List<Borrow> getBorrow() {
		return borrows;
	}

	public void setBorrow(List<Borrow> borrows) {
		this.borrows = borrows;
	}

	@Override
	public String toString() {
		return "BookCopy [bookCopyTitle=" + bookCopyTitle + ", book=" + book + ", bookshelf=" + bookshelf
				+ ", bookBasket=" + bookBasket + ", borrow=" + borrows + "]";
	}

}
