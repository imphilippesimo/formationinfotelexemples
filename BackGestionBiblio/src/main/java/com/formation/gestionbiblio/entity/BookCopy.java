package com.formation.gestionbiblio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookCopy {
@Id
@GeneratedValue
private int bookCopyId;
private String bookCopyTitle;

public BookCopy() {
	// TODO Auto-generated constructor stub
}

public BookCopy(String bookCopyTitle) {
	this.bookCopyTitle = bookCopyTitle;
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

@Override
public String toString() {
	return "BookCopy [bookCopyTitle=" + bookCopyTitle + "]";
}


}
