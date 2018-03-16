package com.infotel.gestionbiblio.dto;

import java.util.ArrayList;
import java.util.List;

import com.infotel.gestionbiblio.entity.Book;

public class AuthorDto {

	private int authorId;
	private String authorLastname; 
	private String authorFirstname;
	private List<Book> book = new ArrayList<Book>();
	
	public AuthorDto() {
		// TODO Auto-generated constructor stub
	}

	public AuthorDto(String authorLastname, String authorFirstname, List<Book> book) {
		this.authorLastname = authorLastname;
		this.authorFirstname = authorFirstname;
		this.book = book;
	}

	public AuthorDto(String authorLastname, String authorFirstname) {
		this.authorLastname = authorLastname;
		this.authorFirstname = authorFirstname;
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

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	
	
	
}
