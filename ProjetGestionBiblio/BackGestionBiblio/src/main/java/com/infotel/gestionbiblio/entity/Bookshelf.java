package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Bookshelf implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookshelfId;
	private String bookshelfName, bookshelfDescription;
	private int bookNumber;
	
	@OneToMany(mappedBy = "bookshelf")
	private List<BookCopy> bookshelfBookCopy;

	public Bookshelf() {
		// TODO Auto-generated constructor stub
	}

	public Bookshelf(String bookshelfName, String bookshelfDescription, int bookNumber,
			List<BookCopy> bookshelfBookCopy) {
		this.bookshelfName = bookshelfName;
		this.bookshelfDescription = bookshelfDescription;
		this.bookNumber = bookNumber;
		this.bookshelfBookCopy = bookshelfBookCopy;
	}

	public int getBookshelfId() {
		return bookshelfId;
	}

	public void setBookshelfId(int bookshelfId) {
		this.bookshelfId = bookshelfId;
	}

	public String getBookshelfName() {
		return bookshelfName;
	}

	public void setBookshelfName(String bookshelfName) {
		this.bookshelfName = bookshelfName;
	}

	public String getBookshelfDescription() {
		return bookshelfDescription;
	}

	public void setBookshelfDescription(String bookshelfDescription) {
		this.bookshelfDescription = bookshelfDescription;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public List<BookCopy> getBookshelfBookCopy() {
		return bookshelfBookCopy;
	}

	public void setBookshelfBookCopy(List<BookCopy> bookshelfBookCopy) {
		this.bookshelfBookCopy = bookshelfBookCopy;
	}

	@Override
	public String toString() {
		return "Bookshelf [bookshelfName=" + bookshelfName + ", bookshelfDescription=" + bookshelfDescription
				+ ", bookNumber=" + bookNumber + ", bookshelfBookCopy=" + bookshelfBookCopy + "]";
	}

}
