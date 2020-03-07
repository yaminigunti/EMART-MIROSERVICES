package com.cts.emart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "category")

public class Category {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

	    private String categoryName;

	    private String gst;
	    
	    
	    

		public Category() {
			
		}

		public Category(int id, String categoryName, String gst) {
			this.id = id;
			this.categoryName = categoryName;
			this.gst = gst;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryname(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getGst() {
			return gst;
		}

		public void setGst(String gst) {
			this.gst = gst;
		}

	    
	    
}
