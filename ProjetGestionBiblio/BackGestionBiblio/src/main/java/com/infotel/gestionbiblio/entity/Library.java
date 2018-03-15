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

	@ManyToMany
	private List<Registration> registrations;
	
	@OneToMany(mappedBy = "library")
	List<Book> books;


	public Library() {
		// TODO Auto-generated constructor stub
	}

	public Library(int libraryCode, String libraryName, String libraryAddress) {
		this.libraryCode = libraryCode;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
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


	public int getIdLibrary() {
		return idLibrary;
	}

	public void setIdLibrary(int idLibrary) {
		this.idLibrary = idLibrary;
	}

	public List<Registration> getRegistrations() {
		return registrations;
	}

	public void setRegistrations(List<Registration> registrations) {
		this.registrations = registrations;
	}

	@Override
	public String toString() {
		return "Library [libraryCode=" + libraryCode + ", libraryName=" + libraryName + ", libraryAddress="
				+ libraryAddress  + "]";
	}

}
