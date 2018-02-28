package com.infotel.gestionbiblio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
@Id
@GeneratedValue

private int memberId;
private String memberLastname, memberFirstname, memberEmail, memberPassword, memberAddress, memberCity, memberPostalCode, memberPhone;

public Member() {
	// TODO Auto-generated constructor stub
}


public Member(String memberLastname, String memberFirstname, String memberEmail, String memberPassword,
		String memberAddress, String memberCity, String memberPostalCode, String memberPhone) {
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

@Override
public String toString() {
	return "Member [memberLastname=" + memberLastname + ", memberFirstname=" + memberFirstname + ", memberEmail="
			+ memberEmail + ", memberPassword=" + memberPassword + ", memberAddress=" + memberAddress + ", memberCity="
			+ memberCity + ", memberPostalCode=" + memberPostalCode + ", memberPhone=" + memberPhone + "]";
}

}
