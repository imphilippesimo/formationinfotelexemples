package com.infotel.gestionbiblio.dto;

import java.util.Date;
import java.util.List;

import com.infotel.gestionbiblio.entity.Library;
import com.infotel.gestionbiblio.entity.Member;

public class RegistrationDto {
	private int registrationId;
	private Date registrationDate;
	private Member registrationMember;
	private List<Library> libraries;
	
	public RegistrationDto() {
		// TODO Auto-generated constructor stub
	}

	public RegistrationDto(Date registrationDate, Member registrationMember, List<Library> libraries) {
		this.registrationDate = registrationDate;
		this.registrationMember = registrationMember;
		this.libraries = libraries;
	}

	public RegistrationDto(Date registrationDate, Member registrationMember) {
		this.registrationDate = registrationDate;
		this.registrationMember = registrationMember;
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

	public List<Library> getLibraries() {
		return libraries;
	}

	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}
	
	
}
