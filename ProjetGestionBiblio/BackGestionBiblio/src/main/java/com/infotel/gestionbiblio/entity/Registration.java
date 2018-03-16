package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	private Member registrationMember;
	
	@ManyToMany(mappedBy = "registrations")
	private List<Library> libraries;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(Date registrationDate, Member registrationMember, List<Library> libraries) {
		super();
		this.registrationDate = registrationDate;
		this.registrationMember = registrationMember;
		this.libraries = libraries;
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

	public List<Library> getLibraries() {
		return libraries;
	}

	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	@Override
	public String toString() {
		return "Registration [registrationId=" + registrationId + ", registrationDate=" + registrationDate
				+ ", registrationMember=" + registrationMember + ", libraries=" + libraries + "]";
	}
	
	
}
