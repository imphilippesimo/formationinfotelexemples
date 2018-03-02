package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Library implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int libraryCode;
	private String libraryName, libraryAddress;

	@OneToMany(mappedBy = "library")
	private List<Catalog> libraryCatalog;
	@ManyToOne
	private Registration registration;

	public Library() {
		// TODO Auto-generated constructor stub
	}

	public Library(int libraryCode, String libraryName, String libraryAddress, List<Catalog> libraryCatalog,
			Registration registration) {
		this.libraryCode = libraryCode;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.libraryCatalog = libraryCatalog;
		this.registration = registration;
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

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	@Override
	public String toString() {
		return "Library [libraryCode=" + libraryCode + ", libraryName=" + libraryName + ", libraryAddress="
				+ libraryAddress + ", libraryCatalog=" + libraryCatalog + ", registration=" + registration + "]";
	}

}
