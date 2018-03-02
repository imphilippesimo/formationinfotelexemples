package com.infotel.gestionbiblio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author 
{
	@Id
	@GeneratedValue
	private int authorId;
	private String authorLastname, authorFirstname;
	
	public Author() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public Author(String authorLastname, String authorFirstname) 
	{
		this.authorLastname = authorLastname;
		this.authorFirstname = authorFirstname;
	}
	
	public int getAuthorId() 
	{
		return authorId;
	}
	
	public void setAuthorId(int authorId) 
	{
		this.authorId = authorId;
	}
	
	public String getAuthorLastname() 
	{
		return authorLastname;
	}
	
	public void setAuthorLastname(String authorLastname) 
	{
		this.authorLastname = authorLastname;
	}
	
	public String getAuthorFirstname() 
	{
		return authorFirstname;
	}
	
	public void setAuthorFirstname(String authorFirstname) 
	{
		this.authorFirstname = authorFirstname;
	}
	
	@Override
	public String toString() 
	{
		return "Author [authorLastname=" + authorLastname + ", authorFirstname=" + authorFirstname + "]";
	}
	

}
