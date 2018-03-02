package com.infotel.gestionbiblio.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Catalog {
	@Id
	@GeneratedValue
	private int catalogId;
	private String catalogName;

	@OneToMany
	private List<Book> bookCatalog;
	@ManyToOne
	private Library library;

	public Catalog() {
		// TODO Auto-generated constructor stub
	}

	public Catalog(String catalogName, List<Book> bookCatalog, Library library) {
		this.catalogName = catalogName;
		this.bookCatalog = bookCatalog;
		this.library = library;
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

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Catalog [catalogName=" + catalogName + ", bookCatalog=" + bookCatalog + ", library=" + library + "]";
	}

}
