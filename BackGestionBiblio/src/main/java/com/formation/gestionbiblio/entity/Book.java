package com.formation.gestionbiblio.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Book {
	private int ISBN;
	private String bookTitre, bookDescription, imagePath;
	private boolean popularBook;
	private float bookPrice;
	private Date publicationDate;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int iSBN, String bookTitre, String bookDescription, String imagePath, boolean popularBook,
			float bookPrice, Date publicationDate) {
		ISBN = iSBN;
		this.bookTitre = bookTitre;
		this.bookDescription = bookDescription;
		this.imagePath = imagePath;
		this.popularBook = popularBook;
		this.bookPrice = bookPrice;
		this.publicationDate = publicationDate;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getBookTitre() {
		return bookTitre;
	}

	public void setBookTitre(String bookTitre) {
		this.bookTitre = bookTitre;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public boolean isPopularBook() {
		return popularBook;
	}

	public void setPopularBook(boolean popularBook) {
		this.popularBook = popularBook;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", bookTitre=" + bookTitre + ", bookDescription=" + bookDescription
				+ ", imagePath=" + imagePath + ", popularBook=" + popularBook + ", bookPrice=" + bookPrice
				+ ", publicationDate=" + publicationDate + "]";
	}
	
	
}
