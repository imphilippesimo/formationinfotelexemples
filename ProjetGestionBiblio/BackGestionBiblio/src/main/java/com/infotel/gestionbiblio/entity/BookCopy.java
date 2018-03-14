package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idBookCopy")
	private int idBookCopy;
	private String bookCopyTitle;

	@ManyToOne(fetch = FetchType.EAGER)
	private Book book;
	
	
	

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
		return "BookCopy [bookCopyTitle=" + bookCopyTitle 	+ "]";
	}

}
