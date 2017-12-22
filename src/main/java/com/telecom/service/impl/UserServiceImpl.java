package com.telecom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.telecom.entity.UserEntity;
import com.telecom.mapper.UserMapper;
import com.telecom.service.UserService;

public class UserServiceImpl implements UserService {

	//引入userMapper实例
	@Autowired
	private UserMapper userMapper;
	
	//为增删改增加事物
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,rollbackFor=Exception.class)
	@Override
	public void insert(UserEntity user) {
		user.setAge(22);
		user.setUserName("zhangsan");
		userMapper.insert(user);
	}

	@Override
	public List<UserEntity> getAll() {
		return userMapper.getAll();
	}

	@Override
	public UserEntity getOne(Long id) {
		return userMapper.getOne(id);
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,rollbackFor=Exception.class)
	@Override
	public void update(UserEntity user) {
		userMapper.update(user);
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,rollbackFor=Exception.class)
	@Override
	public void delete(Long id) {
		userMapper.delete(id);
	}

}
