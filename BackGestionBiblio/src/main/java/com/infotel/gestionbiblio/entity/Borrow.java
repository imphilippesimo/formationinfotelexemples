package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Borrow implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date borrowDate, returnDate;

    @JoinColumn(name = "member", referencedColumnName = "idAdresse")
    @ManyToOne(optional = false)
    private Member member;
    @JoinColumn(name = "bookCopy", referencedColumnName = "idPersonne")
    @ManyToOne(optional = false)
    private BookCopy bookCopy;
	
	@EmbeddedId
	protected BorrowPK borrowPK = new BorrowPK();
	
	@Temporal(TemporalType.DATE)
	private Date emprunt;

	@Temporal(TemporalType.DATE)
	private Date retour;

	public Borrow() {
		// TODO Auto-generated constructor stub
	}

	public Borrow(Date borrowDate, Date returnDate, BookCopy borrowBookCopy, Member borrowMember) {
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.bookCopy = borrowBookCopy;
		this.member = borrowMember;
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

	public BookCopy getBorrowBookCopy() {
		return bookCopy;
	}

	public void setBorrowBookCopy(BookCopy borrowBookCopy) {
		this.bookCopy = borrowBookCopy;
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

	public BookCopy getBookCopy() {
		return bookCopy;
	}

	public void setBookCopy(BookCopy bookCopy) {
		this.bookCopy = bookCopy;
	}

	public BorrowPK getBorrowPK() {
		return borrowPK;
	}

	public void setBorrowPK(BorrowPK borrowPK) {
		this.borrowPK = borrowPK;
	}

	public Date getEmprunt() {
		return emprunt;
	}

	public void setEmprunt(Date emprunt) {
		this.emprunt = emprunt;
	}

	public Date getRetour() {
		return retour;
	}

	public void setRetour(Date retour) {
		this.retour = retour;
	}

	@Override
	public String toString() {
		return "Borrow [borrowDate=" + borrowDate + ", returnDate=" + returnDate + ", borrowBookCopy=" + bookCopy
				+ ", borrowMember=" + member + "]";
	}

}
