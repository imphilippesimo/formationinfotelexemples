package com.infotel.gestionbiblio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Library {

private int libraryCode;
private String libraryName, libraryAddress;

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

@Override
public String toString() {
	return "Library [libraryCode=" + libraryCode + ", libraryName=" + libraryName + ", libraryAddress=" + libraryAddress
			+ "]";
}

}
