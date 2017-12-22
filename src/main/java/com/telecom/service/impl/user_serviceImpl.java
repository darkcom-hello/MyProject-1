package com.telecom.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.telecom.entity.user_entity;
import com.telecom.mapper.user_mapper;
import com.telecom.service.user_service;


@Service
public class user_serviceImpl implements user_service {

	//引入userMapper实例
	@Autowired
	private user_mapper userMapper;
	
	//为增删改增加事物
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,rollbackFor=Exception.class)
	@Override
	public void insert(user_entity user) {
		user.setEmail("22");
		user.setUserName("zhangsan");
		user.setPassword("123");
		user.setGrade(1);
		userMapper.insert(user);
	}

	@Override
	public List<user_entity> getAll() {
		return userMapper.getAll();
	}
	
	@Override
	public boolean getNamePass(String username,String password) {
		boolean flag = false;
		List<user_entity> users = userMapper.getNamePass();
		for(user_entity b:users){
			System.out.println(b.getUserName());
			System.out.println(b.getPassword());
		        if(username.equals((b.getUserName())) && password.equals(b.getPassword())){
		        	flag = true;
		        	 break;
		        }
		       
		}
		return flag;
	}

	@Override
	public user_entity getOne(Integer id) {
		return userMapper.getOne(id);
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,rollbackFor=Exception.class)
	@Override
	public void update(user_entity user) {
		userMapper.update(user);
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,rollbackFor=Exception.class)
	@Override
	public void delete(Integer id) {
		userMapper.delete(id);
	}

}
