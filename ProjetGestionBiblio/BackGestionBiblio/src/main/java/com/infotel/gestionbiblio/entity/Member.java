package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Member  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idMember")
	private int idMember;
	private String memberLastname, memberFirstname;
	
	@Column(unique=true)
	private String  memberEmail;
	
	private String memberPassword, memberAddress, memberCity,
			memberPostalCode, memberPhone;
	
	private boolean administrateur=false;
	
	@OneToMany
	private List<Borrow> borrows;
	@OneToMany
	private List<BookBasket> bookBaskets;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String memberLastname, String memberFirstname, String memberEmail, String memberPassword,
			String memberAddress, String memberCity, String memberPostalCode, String memberPhone,
			boolean administrateur, List<BookBasket> bookBasket, List<Borrow> borrows,
			List<Registration> registrations) {
		super();
		this.memberLastname = memberLastname;
		this.memberFirstname = memberFirstname;
		this.memberEmail = memberEmail;
		this.memberPassword = memberPassword;
		this.memberAddress = memberAddress;
		this.memberCity = memberCity;
		this.memberPostalCode = memberPostalCode;
		this.memberPhone = memberPhone;
		this.administrateur = administrateur;
		this.bookBaskets = bookBasket;
		this.borrows = borrows;
	}

	public Member(String memberLastname, String memberFirstname, String memberEmail, String memberPassword,
			String memberAddress, String memberCity, String memberPostalCode, String memberPhone) 
	{
		this.memberLastname = memberLastname;
		this.memberFirstname = memberFirstname;
		this.memberEmail = memberEmail;
		this.memberPassword = memberPassword;
		this.memberAddress = memberAddress;
		this.memberCity = memberCity;
		this.memberPostalCode = memberPostalCode;
		this.memberPhone = memberPhone;
	}

	public String getMemberLastname() {
		return memberLastname;
	}

	public void setMemberLastname(String memberLastname) {
		this.memberLastname = memberLastname;
	}

	public String getMemberFirstname() {
		return memberFirstname;
	}

	public void setMemberFirstname(String memberFirstname) {
		this.memberFirstname = memberFirstname;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberCity() {
		return memberCity;
	}

	public void setMemberCity(String memberCity) {
		this.memberCity = memberCity;
	}

	public String getMemberPostalCode() {
		return memberPostalCode;
	}

	public void setMemberPostalCode(String memberPostalCode) {
		this.memberPostalCode = memberPostalCode;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public boolean isAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	}

	public List<BookBasket> getBookBasket() {
		return bookBaskets;
	}

	public void setBookBasket(List<BookBasket> bookBaskets) {
		this.bookBaskets = bookBaskets;
	}

	public List<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(List<Borrow> borrows) {
		this.borrows = borrows;
	}



	public int getIdMember() {
		return idMember;
	}

	@Override
	public String toString() {
		return "Member [idMember=" + idMember + ", memberLastname=" + memberLastname + ", memberFirstname="
				+ memberFirstname + ", memberEmail=" + memberEmail + ", memberPassword=" + memberPassword
				+ ", memberAddress=" + memberAddress + ", memberCity=" + memberCity + ", memberPostalCode="
				+ memberPostalCode + ", memberPhone=" + memberPhone + ", administrateur=" + administrateur	+ "]";
	}






}
