package com.model;

public class User {
	
	private int user_id;
	private String password;
	private String role;
	
	
	public User(int user_id, String password, String role) {
		super();
		this.user_id = user_id;
		this.password = password;
		this.role = role;
	}


	public User()
	{
		
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", password=" + password + ", role=" + role + "]";
	}


	

	
	

}
