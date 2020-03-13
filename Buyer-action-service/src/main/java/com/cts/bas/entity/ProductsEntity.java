package com.cts.bas.entity;

import javax.persistence.*;

@Entity
@Table(name="Products")
public class ProductsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pId")
	private int productId;
	@Column(name="pName")
	private String productName;
	@Column(name="price")
	private double productPrice;
	@Column(name="pDesc")
	private String productDesc;
	@Column(name="sId")
	private int subCategoryId;
	
	public ProductsEntity() {
		
	}

	public ProductsEntity(int productId, String productName, double productPrice, String productDesc, int subCategoryId) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDesc = productDesc;
		this.subCategoryId = subCategoryId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

}
