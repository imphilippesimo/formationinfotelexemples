package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Editor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int editorId;
	private String editorName, editorAddress;



	public Editor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Editor(String editorName, String editorAddress) {
		super();
		this.editorName = editorName;
		this.editorAddress = editorAddress;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getEditorId() {
		return editorId;
	}

	@Override
	public String toString() {
		return "Editor [editorId=" + editorId + ", editorName=" + editorName + ", editorAddress=" + editorAddress
				+  "]";
	}



}
