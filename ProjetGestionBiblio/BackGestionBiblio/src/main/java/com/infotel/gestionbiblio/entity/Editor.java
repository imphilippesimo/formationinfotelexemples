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

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "editor")
	private List<Book> bookEditor;

	public Editor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Editor(String editorName, String editorAddress, List<Book> bookEditor) {
		super();
		this.editorName = editorName;
		this.editorAddress = editorAddress;
		this.bookEditor = bookEditor;
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

	public List<Book> getBookEditor() {
		return bookEditor;
	}

	public void setBookEditor(List<Book> bookEditor) {
		this.bookEditor = bookEditor;
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
				+ ", bookEditor=" + bookEditor + "]";
	}



}
