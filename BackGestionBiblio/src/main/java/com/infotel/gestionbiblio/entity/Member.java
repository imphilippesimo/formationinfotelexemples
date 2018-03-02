package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Member  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue

	private int memberId;
	private String memberLastname, memberFirstname, memberEmail, memberPassword, memberAddress, memberCity,
			memberPostalCode, memberPhone;

	@OneToMany(mappedBy = "member")
	private List<Borrow> borrows = new ArrayList<Borrow>();
	
	@ManyToOne
	private BookBasket bookBasket;
	@ManyToOne
	private Registration registration;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberLastname, String memberFirstname, String memberEmail, String memberPassword,
			String memberAddress, String memberCity, String memberPostalCode, String memberPhone, List<Borrow> borrow,
			BookBasket bookBasket, Registration registration) {
		this.memberLastname = memberLastname;
		this.memberFirstname = memberFirstname;
		this.memberEmail = memberEmail;
		this.memberPassword = memberPassword;
		this.memberAddress = memberAddress;
		this.memberCity = memberCity;
		this.memberPostalCode = memberPostalCode;
		this.memberPhone = memberPhone;
		this.borrows = borrow;
		this.bookBasket = bookBasket;
		this.registration = registration;
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

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public List<Borrow> getBorrow() {
		return borrows;
	}

	public void setBorrow(List<Borrow> borrows) {
		this.borrows = borrows;
	}

	public BookBasket getBookBasket() {
		return bookBasket;
	}

	public void setBookBasket(BookBasket bookBasket) {
		this.bookBasket = bookBasket;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	@Override
	public String toString() {
		return "Member [memberLastname=" + memberLastname + ", memberFirstname=" + memberFirstname + ", memberEmail="
				+ memberEmail + ", memberPassword=" + memberPassword + ", memberAddress=" + memberAddress
				+ ", memberCity=" + memberCity + ", memberPostalCode=" + memberPostalCode + ", memberPhone="
				+ memberPhone + ", borrow=" + borrows + ", bookBasket=" + bookBasket + ", registration=" + registration
				+ "]";
	}

}
