package com.telecom.service;

import java.util.List;

import com.telecom.entity.UserEntity;

public interface UserService {

	void insert(UserEntity user);
	
	List<UserEntity> getAll();
	
	UserEntity getOne(Long id);
	
	void update(UserEntity user);
	
	void delete(Long id);
	
}
