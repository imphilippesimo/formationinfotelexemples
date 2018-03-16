package com.infotel.gestionbiblio.dto;

import java.util.List;

import com.infotel.gestionbiblio.entity.BookCopy;

public class BookshelfDto {
	private int bookshelfId;
	private String bookshelfName;
	private String bookshelfDescription;
	private int bookNumber;
	private List<BookCopy> bookshelfBookCopy;
	
	public BookshelfDto() {
		// TODO Auto-generated constructor stub
	}

	public BookshelfDto(String bookshelfName, String bookshelfDescription, int bookNumber,
			List<BookCopy> bookshelfBookCopy) {
		this.bookshelfName = bookshelfName;
		this.bookshelfDescription = bookshelfDescription;
		this.bookNumber = bookNumber;
		this.bookshelfBookCopy = bookshelfBookCopy;
	}

	public BookshelfDto(String bookshelfName, String bookshelfDescription, int bookNumber) {
		this.bookshelfName = bookshelfName;
		this.bookshelfDescription = bookshelfDescription;
		this.bookNumber = bookNumber;
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
	
	
}
