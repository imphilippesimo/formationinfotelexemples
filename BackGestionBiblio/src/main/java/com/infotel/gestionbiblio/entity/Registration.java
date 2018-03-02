package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Registration  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue

	private int registrationId;
	private Date registrationDate;
	@OneToMany(mappedBy = "registration")
	private List<Member> registrationMember;
	@OneToMany(mappedBy = "registration")
	private List<Library> registrationLibrary;

	public Registration() {
		// TODO Auto-generated constructor stub
	}

	public Registration(Date registrationDate, List<Member> registrationMember, List<Library> registrationLibrary) {
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

	public List<Member> getRegistrationMember() {
		return registrationMember;
	}

	public void setRegistrationMember(List<Member> registrationMember) {
		this.registrationMember = registrationMember;
	}

	public List<Library> getRegistrationLibrary() {
		return registrationLibrary;
	}

	public void setRegistrationLibrary(List<Library> registrationLibrary) {
		this.registrationLibrary = registrationLibrary;
	}

	@Override
	public String toString() {
		return "Registration [registrationDate=" + registrationDate + ", registrationMember=" + registrationMember
				+ ", registrationLibrary=" + registrationLibrary + "]";
	}

}
