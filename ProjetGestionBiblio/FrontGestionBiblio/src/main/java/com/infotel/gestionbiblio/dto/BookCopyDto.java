package com.infotel.gestionbiblio.dto;

import java.util.List;

import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.BookBasket;
import com.infotel.gestionbiblio.entity.Bookshelf;
import com.infotel.gestionbiblio.entity.Borrow;

public class BookCopyDto {
	private int idBookCopy;
	private String bookCopyTitle;
	private Bookshelf bookshelf;
	private List<BookBasket> bookBaskets;
	private Book book;
	List<Borrow> borrows;
	
	public BookCopyDto() {
		// TODO Auto-generated constructor stub
	}

	public BookCopyDto(String bookCopyTitle, Bookshelf bookshelf, List<BookBasket> bookBaskets, Book book,
			List<Borrow> borrows) {
		this.bookCopyTitle = bookCopyTitle;
		this.bookshelf = bookshelf;
		this.bookBaskets = bookBaskets;
		this.book = book;
		this.borrows = borrows;
	}

	public BookCopyDto(String bookCopyTitle, Bookshelf bookshelf, Book book) {
		this.bookCopyTitle = bookCopyTitle;
		this.bookshelf = bookshelf;
		this.book = book;
	}

	public int getIdBookCopy() {
		return idBookCopy;
	}

	public void setIdBookCopy(int idBookCopy) {
		this.idBookCopy = idBookCopy;
	}

	public String getBookCopyTitle() {
		return bookCopyTitle;
	}

	public void setBookCopyTitle(String bookCopyTitle) {
		this.bookCopyTitle = bookCopyTitle;
	}

	public Bookshelf getBookshelf() {
		return bookshelf;
	}

	public void setBookshelf(Bookshelf bookshelf) {
		this.bookshelf = bookshelf;
	}

	public List<BookBasket> getBookBaskets() {
		return bookBaskets;
	}

	public void setBookBaskets(List<BookBasket> bookBaskets) {
		this.bookBaskets = bookBaskets;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public List<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(List<Borrow> borrows) {
		this.borrows = borrows;
	}
	
}
