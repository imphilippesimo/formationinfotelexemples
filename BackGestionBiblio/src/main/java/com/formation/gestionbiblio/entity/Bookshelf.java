package com.formation.gestionbiblio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bookshelf {
@Id
@GeneratedValue
private int  bookshelfId;
private String bookshelfName, bookshelfDescription;
private int bookNumber;

public Bookshelf() {
	// TODO Auto-generated constructor stub
}

public Bookshelf(String bookshelfName, String bookshelfDescription, int bookNumber) {
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

@Override
public String toString() {
	return "Bookshelf [bookshelfName=" + bookshelfName + ", bookshelfDescription=" + bookshelfDescription
			+ ", bookNumber=" + bookNumber + "]";
}

}
