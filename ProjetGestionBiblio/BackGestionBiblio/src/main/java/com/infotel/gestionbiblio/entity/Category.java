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
public class Category  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categoryId;
	private String categoryName, CategoryDescription;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
	private List<Book> bookCategory;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String categoryName, String categoryDescription, List<Book> bookCategory) {
		super();
		this.categoryName = categoryName;
		CategoryDescription = categoryDescription;
		this.bookCategory = bookCategory;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return CategoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
	}

	public List<Book> getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(List<Book> bookCategory) {
		this.bookCategory = bookCategory;
	}

	public int getCategoryId() {
		return categoryId;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", CategoryDescription="
				+ CategoryDescription + ", bookCategory=" + bookCategory + "]";
	}


}
