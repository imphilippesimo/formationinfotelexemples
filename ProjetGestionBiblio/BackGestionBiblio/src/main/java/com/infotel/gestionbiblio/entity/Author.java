package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Author implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int authorId;
	private String authorLastname, authorFirstname;

	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "author")
	private List<Book> book = new ArrayList<Book>();

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String authorLastname, String authorFirstname, List<Book> book) {
		super();
		this.authorLastname = authorLastname;
		this.authorFirstname = authorFirstname;
		this.book = book;
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

	public int getAuthorId() {
		return authorId;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorLastname=" + authorLastname + ", authorFirstname="
				+ authorFirstname + ", book=" + book + "]";
	}

	
}
