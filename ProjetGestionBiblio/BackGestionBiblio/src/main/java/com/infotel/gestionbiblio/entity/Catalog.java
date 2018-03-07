package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
//Affiche la liste des périodiques
@NamedQuery(name="catalog.selectperiodique", query="FROM catalog WHERE name='periodique'")

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
	@JoinColumn(name="ID_CATALOG", referencedColumnName="catalogId")
	private List<Book> bookCatalog;
	
	@ManyToOne
	private Library library;

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
