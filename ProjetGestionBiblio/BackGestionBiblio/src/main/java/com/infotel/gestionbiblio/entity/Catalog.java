package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Catalog  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int catalogId;
	private String catalogName;

	@OneToMany
	private List<Book> bookCatalog;


	public Catalog() {
		// TODO Auto-generated constructor stub
	}

	public Catalog(String catalogName, List<Book> bookCatalog) {
		this.catalogName = catalogName;
		this.bookCatalog = bookCatalog;
	//	this.library = library;
	}

	public int getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public List<Book> getBookCatalog() {
		return bookCatalog;
	}

	public void setBookCatalog(List<Book> bookCatalog) {
		this.bookCatalog = bookCatalog;
	}

	@Override
	public String toString() {
		return "Catalog [catalogName=" + catalogName + "]";
	}

}
