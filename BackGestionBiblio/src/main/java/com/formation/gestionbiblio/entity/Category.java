package com.formation.gestionbiblio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue
	private int categoryId;
	private String categoryName, CategoryDescription;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String categoryName, String categoryDescription) {
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

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", CategoryDescription=" + CategoryDescription + "]";
	}
	
}
