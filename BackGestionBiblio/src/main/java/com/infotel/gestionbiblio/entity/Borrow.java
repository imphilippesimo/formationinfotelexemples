package com.infotel.gestionbiblio.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Borrow {

	private Date borrowDate, returnDate;

	@OneToMany(mappedBy = "borrow")
	private List<BookCopy> borrowBookCopy;
	@OneToMany(mappedBy = "borrow")
	private List<Member> borrowMember;

	public Borrow() {
		// TODO Auto-generated constructor stub
	}

	public Borrow(Date borrowDate, Date returnDate, List<BookCopy> borrowBookCopy, List<Member> borrowMember) {
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.borrowBookCopy = borrowBookCopy;
		this.borrowMember = borrowMember;
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

	public List<BookCopy> getBorrowBookCopy() {
		return borrowBookCopy;
	}

	public void setBorrowBookCopy(List<BookCopy> borrowBookCopy) {
		this.borrowBookCopy = borrowBookCopy;
	}

	public List<Member> getBorrowMember() {
		return borrowMember;
	}

	public void setBorrowMember(List<Member> borrowMember) {
		this.borrowMember = borrowMember;
	}

	@Override
	public String toString() {
		return "Borrow [borrowDate=" + borrowDate + ", returnDate=" + returnDate + ", borrowBookCopy=" + borrowBookCopy
				+ ", borrowMember=" + borrowMember + "]";
	}

}
