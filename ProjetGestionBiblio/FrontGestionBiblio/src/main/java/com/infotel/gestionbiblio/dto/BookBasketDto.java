package com.infotel.gestionbiblio.dto;

import java.util.Date;
import java.util.List;

import com.infotel.gestionbiblio.entity.BookCopy;
import com.infotel.gestionbiblio.entity.Member;

public class BookBasketDto {
	private int bookBasketId;
	private Date bookBasketCreationDate;
	private Date bookBasketDeliveryDate;
	private List<BookCopy> bookBasketBookCopy;
	private Member member;
	
	public BookBasketDto() {
		// TODO Auto-generated constructor stub
	}

	public BookBasketDto(Date bookBasketCreationDate, Date bookBasketDeliveryDate, List<BookCopy> bookBasketBookCopy,
			Member member) {
		this.bookBasketCreationDate = bookBasketCreationDate;
		this.bookBasketDeliveryDate = bookBasketDeliveryDate;
		this.bookBasketBookCopy = bookBasketBookCopy;
		this.member = member;
	}

	public BookBasketDto(Date bookBasketCreationDate, Date bookBasketDeliveryDate, Member member) {
		this.bookBasketCreationDate = bookBasketCreationDate;
		this.bookBasketDeliveryDate = bookBasketDeliveryDate;
		this.member = member;
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

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	
	
}
