package com.telecom.entity;

import java.io.Serializable;

public class user_entity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int userId;
	private String username;
	private int grade;
	private String password;
	private String email;
	public user_entity() {}
	public user_entity(String username, String email, int grade, String password) {
		super();
		this.username = username;
		this.email = email;
		this.grade = grade;
		this.password = password;
	}
	
	public user_entity(int id, String username, String email, int grade, String password) {
		super();
		this.userId = id;
		this.username = username;
		this.email = email;
		this.grade = grade;
		this.password = password;
	}
	public user_entity(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return userId;
	}
	public void setId(int id) {
		this.userId = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
