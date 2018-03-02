package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Editor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int editorId;
	private String editorName, editorAddress;

	@OneToMany(mappedBy = "editor")
	private List<Book> bookEditor;

	public Editor() {
		// TODO Auto-generated constructor stub
	}

	public Editor(String editorName, String editorAddress, List<Book> bookEditor) {
		this.editorName = editorName;
		this.editorAddress = editorAddress;
		this.bookEditor = bookEditor;
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

	public List<Book> getBookEditor() {
		return bookEditor;
	}

	public void setBookEditor(List<Book> bookEditor) {
		this.bookEditor = bookEditor;
	}

	@Override
	public String toString() {
		return "Editor [editorName=" + editorName + ", editorAddress=" + editorAddress + ", bookEditor=" + bookEditor
				+ "]";
	}

}
