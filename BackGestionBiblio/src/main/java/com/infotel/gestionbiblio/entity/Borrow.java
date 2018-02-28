package com.infotel.gestionbiblio.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Borrow {

private Date borrowDate, returnDate;

public Borrow() {
	// TODO Auto-generated constructor stub
}

public Borrow(Date borrowDate, Date returnDate) {
	this.borrowDate = borrowDate;
	this.returnDate = returnDate;
}

public Date getBorrowDate() {
	return borrowDate;
}

public void setBorrowDate(Date borrowDate) {
	this.borrowDate = borrowDate;
}

public Date getReturnDate() {
	return returnDate;
}

public void setReturnDate(Date returnDate) {
	this.returnDate = returnDate;
}

@Override
public String toString() {
	return "Borrow [borrowDate=" + borrowDate + ", returnDate=" + returnDate + "]";
}



}
