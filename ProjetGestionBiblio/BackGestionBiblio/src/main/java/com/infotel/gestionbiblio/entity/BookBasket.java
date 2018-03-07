package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class BookBasket implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookBasketId;
	private Date bookBasketCreationDate, bookBasketDeliveryDate;

	@OneToMany
	private List<BookCopy> bookBasketBookCopy;
	@OneToMany
	private List<Member> bookBasketMember;

	public BookBasket() {
		// TODO Auto-generated constructor stub
	}

	public BookBasket(Date bookBasketCreationDate, Date bookBasketDeliveryDate, List<BookCopy> bookBasketBookCopy,
			List<Member> bookBasketMember) {
		this.bookBasketCreationDate = bookBasketCreationDate;
		this.bookBasketDeliveryDate = bookBasketDeliveryDate;
		this.bookBasketBookCopy = bookBasketBookCopy;
		this.bookBasketMember = bookBasketMember;
	}

	public int getBookBasketId() {
		return bookBasketId;
	}

	public void setBookBasketId(int bookBasketId) {
		this.bookBasketId = bookBasketId;
	}

	public Date getBookBasketCreationDate() {
		return bookBasketCreationDate;
	}

	public void setBookBasketCreationDate(Date bookBasketCreationDate) {
		this.bookBasketCreationDate = bookBasketCreationDate;
	}

	public Date getBookBasketDeliveryDate() {
		return bookBasketDeliveryDate;
	}

	public void setBookBasketDeliveryDate(Date bookBasketDeliveryDate) {
		this.bookBasketDeliveryDate = bookBasketDeliveryDate;
	}

	public List<BookCopy> getBookBasketBookCopy() {
		return bookBasketBookCopy;
	}

	public void setBookBasketBookCopy(List<BookCopy> bookBasketBookCopy) {
		this.bookBasketBookCopy = bookBasketBookCopy;
	}

	public List<Member> getBookBasketMember() {
		return bookBasketMember;
	}

	public void setBookBasketMember(List<Member> bookBasketMember) {
		this.bookBasketMember = bookBasketMember;
	}

	@Override
	public String toString() {
		return "BookBasket [bookBasketCreationDate=" + bookBasketCreationDate + ", bookBasketDeliveryDate="
				+ bookBasketDeliveryDate + ", bookBasketBookCopy=" + bookBasketBookCopy + ", bookBasketMember="
				+ bookBasketMember + "]";
	}

}
