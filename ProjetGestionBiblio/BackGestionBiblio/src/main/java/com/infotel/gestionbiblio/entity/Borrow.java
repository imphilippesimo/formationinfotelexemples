package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Borrow implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date borrowDate, returnDate;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idBorrow;
	
	@ManyToOne
    private Member member;
    
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "borrows")
    private List<BookCopy> bookCopys=new ArrayList<>();

    
	public Borrow() {
		// TODO Auto-generated constructor stub
	}
	public int getIdBorrow() {
		return idBorrow;
	}



	public void setIdBorrow(int idBorrow) {
		this.idBorrow = idBorrow;
	}


	public Borrow(Date borrowDate, Date returnDate, Member member, List<BookCopy> bookCopys) {
		super();
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.member = member;
		this.bookCopys = bookCopys;
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



	public List<BookCopy> getBookCopys() {
		return bookCopys;
	}



	public void setBookCopys(List<BookCopy> bookCopys) {
		this.bookCopys = bookCopys;
	}



	public Member getBorrowMember() {
		return member;
	}

	public void setBorrowMember(Member borrowMember) {
		this.member = borrowMember;
	}

	
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}


	

	@Override
	public String toString() {
		return "Borrow [borrowDate=" + borrowDate + ", returnDate=" + returnDate 
				+ ", member=" + member + ", bookCopy=" + bookCopys + "]";
	}




}
