package com.infotel.gestionbiblio.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.infotel.gestionbiblio.entity.BookCopy;
import com.infotel.gestionbiblio.entity.Member;

public class BorrowDto {
	private Date borrowDate;
    private Date returnDate;
	private int idBorrow;
	private Member member;
	private List<BookCopy> bookCopys=new ArrayList<>();
	
	public BorrowDto() {
		// TODO Auto-generated constructor stub
	}

	public BorrowDto(Date borrowDate, Date returnDate, Member member, List<BookCopy> bookCopys) {
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.member = member;
		this.bookCopys = bookCopys;
	}

	public BorrowDto(Date borrowDate, Date returnDate, Member member) {
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.member = member;
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

	public int getIdBorrow() {
		return idBorrow;
	}

	public void setIdBorrow(int idBorrow) {
		this.idBorrow = idBorrow;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public List<BookCopy> getBookCopys() {
		return bookCopys;
	}

	public void setBookCopys(List<BookCopy> bookCopys) {
		this.bookCopys = bookCopys;
	}
	
	
	
}
