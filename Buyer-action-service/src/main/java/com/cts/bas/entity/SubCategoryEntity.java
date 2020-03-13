package com.cts.bas.entity;

import javax.persistence.*;

@Entity
@Table(name="SubCategory")
public class SubCategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sId")
	private int subCategoryId;
	@Column(name="sName")
	private String subCategoryName;
	@Column(name="cId")
	private int categoryId;
	
	public SubCategoryEntity() {
		
	}

	public SubCategoryEntity(int subCategoryId, String subCategoryName, int categoryId) {

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
