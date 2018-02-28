package com.formation.gestionbiblio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Catalog {
@Id
@GeneratedValue
private int catalogId;
private String catalogName;

public Catalog() {
	// TODO Auto-generated constructor stub
}

public Catalog(String catalogName) {
	this.catalogName = catalogName;
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

@Override
public String toString() {
	return "Catalog [catalogName=" + catalogName + "]";
}






}
