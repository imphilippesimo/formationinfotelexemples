package com.infotel.gestionbiblio.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookBasket {
@Id
@GeneratedValue
private int bookBasketId;
private Date bookBasketCreationDate, bookBasketDeliveryDate;

public BookBasket() {
	// TODO Auto-generated constructor stub
}

public BookBasket(Date bookBasketCreationDate, Date bookBasketDeliveryDate) {
	this.bookBasketCreationDate = bookBasketCreationDate;
	this.bookBasketDeliveryDate = bookBasketDeliveryDate;
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

@Override
public String toString() {
	return "BookBasket [bookBasketCreationDate=" + bookBasketCreationDate + ", bookBasketDeliveryDate="
			+ bookBasketDeliveryDate + "]";
}

}
