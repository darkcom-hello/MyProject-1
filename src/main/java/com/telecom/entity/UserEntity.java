package com.telecom.entity;

import java.io.Serializable;

public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String userName;
	private int age;
	public UserEntity() {}
	public UserEntity(String userName, int age) {
		super();
		this.userName = userName;
		this.age = age;
	}
	
	public UserEntity(int id, String userName, int age) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
