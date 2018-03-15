package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;




@Entity
public class BookCopy implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idBookCopy;
	private String bookCopyTitle;
	
	@ManyToOne
	private Bookshelf bookshelf;
	
	@ManyToMany
	private List<BookBasket> bookBaskets;

	@ManyToOne
	private Book book;
	
	@ManyToMany
	List<Borrow> borrows;
	
	
	

	public Bookshelf getBookshelf() {
		return bookshelf;
	}

	public void setBookshelf(Bookshelf bookshelf) {
		this.bookshelf = bookshelf;
	}

	public List<BookBasket> getBookBasket() {
		return bookBaskets;
	}

	public void setBookBasket(List<BookBasket> bookBaskets) {
		this.bookBaskets = bookBaskets;
	}

	public List<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(List<Borrow> borrows) {
		this.borrows = borrows;
	}

	public void setIdBookCopy(int idBookCopy) {
		this.idBookCopy = idBookCopy;
	}

	public BookCopy() {
		// TODO Auto-generated constructor stub
	}

	public BookCopy(String bookCopyTitle, Book book) {
		this.bookCopyTitle = bookCopyTitle;
		this.book = book;
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


	@Override
	public String toString() {
		return "BookCopy [idBookCopy=" + idBookCopy + ", bookCopyTitle=" + bookCopyTitle + ", bookshelf=" + bookshelf
				+ ", bookBasket=" + bookBaskets + ", book=" + book + ", borrows=" + borrows + "]";
	}

}
