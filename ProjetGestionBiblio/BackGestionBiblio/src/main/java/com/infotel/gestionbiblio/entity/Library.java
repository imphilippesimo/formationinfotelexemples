package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

	@OneToMany
	private List<Catalog> libraryCatalog;
	
	@ManyToOne
	private Registration registration;


	public Library() {
		// TODO Auto-generated constructor stub
	}

	public Library(int libraryCode, String libraryName, String libraryAddress, List<Catalog> libraryCatalog) {
		this.libraryCode = libraryCode;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.libraryCatalog = libraryCatalog;
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

	public List<Catalog> getLibraryCatalog() {
		return libraryCatalog;
	}

	public void setLibraryCatalog(List<Catalog> libraryCatalog) {
		this.libraryCatalog = libraryCatalog;
	}


	@Override
	public String toString() {
		return "Library [libraryCode=" + libraryCode + ", libraryName=" + libraryName + ", libraryAddress="
				+ libraryAddress  + "]";
	}

}
