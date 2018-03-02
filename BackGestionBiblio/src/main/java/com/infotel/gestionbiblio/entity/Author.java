package com.infotel.gestionbiblio.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue
	private int authorId;
	private String authorLastname, authorFirstname;

	@ManyToMany(mappedBy = "author")
	private List<Book> book = new ArrayList<Book>();

	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(String authorLastname, String authorFirstname, List<Book> book) {
		this.authorLastname = authorLastname;
		this.authorFirstname = authorFirstname;
		this.book = book;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorLastname() {
		return authorLastname;
	}

	public void setAuthorLastname(String authorLastname) {
		this.authorLastname = authorLastname;
	}

	public String getAuthorFirstname() {
		return authorFirstname;
	}

	public void setAuthorFirstname(String authorFirstname) {
		this.authorFirstname = authorFirstname;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [authorLastname=" + authorLastname + ", authorFirstname=" + authorFirstname + ", book=" + book
				+ "]";
	}

}
