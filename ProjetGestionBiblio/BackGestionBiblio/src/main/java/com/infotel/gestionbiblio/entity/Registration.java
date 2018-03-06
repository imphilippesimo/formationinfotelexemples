package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Registration  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int registrationId;
	
	@Temporal(TemporalType.DATE)
	private Date registrationDate;
	
	@OneToOne
	private Member registrationMember;
	
	@OneToOne
	private Library registrationLibrary;

	public Registration() {
		// TODO Auto-generated constructor stub
	}


	public Registration(Date registrationDate, Member registrationMember, Library registrationLibrary) {
		super();
		this.registrationDate = registrationDate;
		this.registrationMember = registrationMember;
		this.registrationLibrary = registrationLibrary;
	}


	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Member getRegistrationMember() {
		return registrationMember;
	}

	public void setRegistrationMember(Member registrationMember) {
		this.registrationMember = registrationMember;
	}

	public Library getRegistrationLibrary() {
		return registrationLibrary;
	}

	public void setRegistrationLibrary(Library registrationLibrary) {
		this.registrationLibrary = registrationLibrary;
	}

	@Override
	public String toString() {
		return "Registration [registrationDate=" + registrationDate + ", registrationMember=" + registrationMember
				+ ", registrationLibrary=" + registrationLibrary + "]";
	}

}
