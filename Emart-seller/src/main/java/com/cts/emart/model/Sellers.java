package com.cts.emart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Sellers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String  userName;	
	private String password;
	private String confirmPassword;
	
	
	public Sellers() {
		super();
	}


	public Sellers(int id, String userName, String password, String confirmPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	
}