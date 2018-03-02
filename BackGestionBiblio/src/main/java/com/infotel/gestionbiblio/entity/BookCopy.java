package com.infotel.gestionbiblio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookCopy {
	@Id
	@GeneratedValue
	private int bookCopyId;
	private String bookCopyTitle;

	@ManyToOne
	private Book book;
	@ManyToOne
	private Bookshelf bookshelf;
	@ManyToOne
	private BookBasket bookBasket;
	@ManyToOne
	private Borrow borrow;

	public BookCopy() {
		// TODO Auto-generated constructor stub
	}

	public BookCopy(String bookCopyTitle, Book book, Bookshelf bookshelf, BookBasket bookBasket, Borrow borrow) {
		this.bookCopyTitle = bookCopyTitle;
		this.book = book;
		this.bookshelf = bookshelf;
		this.bookBasket = bookBasket;
		this.borrow = borrow;
	}

	public int getBookCopyId() {
		return bookCopyId;
	}

	public void setBookCopyId(int bookCopyId) {
		this.bookCopyId = bookCopyId;
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

	public Borrow getBorrow() {
		return borrow;
	}

	public void setBorrow(Borrow borrow) {
		this.borrow = borrow;
	}

	@Override
	public String toString() {
		return "BookCopy [bookCopyTitle=" + bookCopyTitle + ", book=" + book + ", bookshelf=" + bookshelf
				+ ", bookBasket=" + bookBasket + ", borrow=" + borrow + "]";
	}

}
