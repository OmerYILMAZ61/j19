package com.vektorel.setget;

public class Veritabani {

	private String userName = "username";
	private String password = "pass";

	
	//dao
	public Veritabani(){
		
	}
	public String getUserName() {
		return this.userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
