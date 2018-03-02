package com.infotel.gestionbiblio.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BorrowPK 
{
	@Basic(optional = false)
	@Column(name = "idMember")
	private int idMember;
	@Basic(optional = false)
	@Column(name = "idBookCopy")
	private int idBookCopy;

	public BorrowPK() 
	{
		super();
	}

	public BorrowPK(int idMember, int idBookCopy) 
	{
		super();
		this.idMember = idMember;
		this.idBookCopy = idBookCopy;
	}

	public int getIdMember() 
	{
		return idMember;
	}

	public void setIdMember(int idMember) 
	{
		this.idMember = idMember;
	}

	public int getIdBookCopy() 
	{
		return idBookCopy;
	}

	public void setIdBookCopy(int idBookCopy) 
	{
		this.idBookCopy = idBookCopy;
	}

	@Override
	public String toString() 
	{
		return "BorrowPK [idMember=" + idMember + ", idBookCopy=" + idBookCopy + "]";
	}

}
