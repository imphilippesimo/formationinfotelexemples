package com.infotel.gestionbiblio.dto;

import java.util.List;

import com.infotel.gestionbiblio.entity.Book;

public class CategoryDto {
	private int categoryId;
	private String categoryName;
	private String CategoryDescription;
	private List<Book> bookCategory;
	
	public CategoryDto() {
		// TODO Auto-generated constructor stub
	}

	public CategoryDto(String categoryName, String categoryDescription, List<Book> bookCategory) {
		this.categoryName = categoryName;
		CategoryDescription = categoryDescription;
		this.bookCategory = bookCategory;
	}

	public CategoryDto(String categoryName, String categoryDescription) {
		this.categoryName = categoryName;
		CategoryDescription = categoryDescription;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
	
	
}
