package com.jefry;

public class User {
	
	private int id;
	private String userNoid;	
	private String userName;
	private String password;

	
	public String getUserNoid() {
		return userNoid;
	}

	public void setUserNoid(String userNoid) {
		this.userNoid = userNoid;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
