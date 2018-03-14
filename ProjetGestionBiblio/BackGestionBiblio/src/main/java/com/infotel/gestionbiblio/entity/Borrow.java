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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Borrow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date borrowDate, returnDate;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idBorrow;
<<<<<<< Upstream, based on develop
	
	@OneToOne
    @JoinColumn(name = "member", referencedColumnName = "idMember")    
    private Member member;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "bookCopy", referencedColumnName = "idBorrow")
     private List<BookCopy> bookCopys=new ArrayList<>();
	
	
	
=======

	@JoinColumn(name = "member", referencedColumnName = "idMember")
	@OneToOne
	private Member member;

	@OneToMany
	@JoinColumn(name = "bookCopy", referencedColumnName = "idBorrow")
	private List<BookCopy> bookCopys = new ArrayList<>();
>>>>>>> 4654b12 [Mickael] push modif JSP formulaire recherche + DAO Book + Service Book et leurs implémentations.

	public Borrow() {
		// TODO Auto-generated constructor stub
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
		return "Borrow [borrowDate=" + borrowDate + ", returnDate=" + returnDate + ", member=" + member + ", bookCopy="
				+ bookCopys + "]";
	}

}
