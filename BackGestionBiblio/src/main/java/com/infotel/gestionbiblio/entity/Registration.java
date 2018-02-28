package com.infotel.gestionbiblio.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Registration {
@Id
@GeneratedValue

private int registrationId;
private Date registrationDate;

public Registration() {
	// TODO Auto-generated constructor stub
}

public Registration(Date registrationDate) {
	this.registrationDate = registrationDate;
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

@Override
public String toString() {
	return "Registration [registrationDate=" + registrationDate + "]";
}

}
