package com.cts.bas.model;

public class SubCategory {
	
	private int subCategoryId;
	private String subCategoryName;
	private int categoryId;
	
	public SubCategory() {
		
	}

	public SubCategory(int subCategoryId, String subCategoryName, int categoryId) {

		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.categoryId = categoryId;
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
