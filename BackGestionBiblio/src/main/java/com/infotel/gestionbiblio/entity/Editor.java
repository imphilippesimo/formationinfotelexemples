package com.infotel.gestionbiblio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Editor {
@Id
@GeneratedValue
private int editorId;
private String editorName, editorAddress;

public Editor() {
	// TODO Auto-generated constructor stub
}



public Editor(String editorName, String editorAddress) {
	this.editorName = editorName;
	this.editorAddress = editorAddress;
}



public int getEditorId() {
	return editorId;
}

public void setEditorId(int editorId) {
	this.editorId = editorId;
}

public String getEditorName() {
	return editorName;
}

public void setEditorName(String editorName) {
	this.editorName = editorName;
}

public String getEditorAddress() {
	return editorAddress;
}

public void setEditorAddress(String editorAddress) {
	this.editorAddress = editorAddress;
}



@Override
public String toString() {
	return "Editor [editorName=" + editorName + ", editorAddress=" + editorAddress + "]";
}




}
