package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Library implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLibrary;
	private int libraryCode;
	private String libraryName, libraryAddress;

	@OneToMany(mappedBy = "library")
	private List<Registration> registrations;
	
	@OneToMany
	List<Book> books;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(int libraryCode, String libraryName, String libraryAddress, List<Registration> registrations,
			List<Book> books) {
		super();
		this.libraryCode = libraryCode;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.registrations = registrations;
		this.books = books;
	}

	public int getLibraryCode() {
		return libraryCode;
	}

	public void setLibraryCode(int libraryCode) {
		this.libraryCode = libraryCode;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryAddress() {
		return libraryAddress;
	}

	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}

	public List<Registration> getRegistrations() {
		return registrations;
	}

	public void setRegistrations(List<Registration> registrations) {
		this.registrations = registrations;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getIdLibrary() {
		return idLibrary;
	}

	@Override
	public String toString() {
		return "Library [idLibrary=" + idLibrary + ", libraryCode=" + libraryCode + ", libraryName=" + libraryName
				+ ", libraryAddress=" + libraryAddress + "]";
	}


	
}
