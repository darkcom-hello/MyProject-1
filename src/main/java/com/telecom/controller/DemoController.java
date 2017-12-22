package com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telecom.service.user_service;

@Controller
public class DemoController {

	@RequestMapping("/login")
	public String m() {
		return "index";  
	}
	
	@Autowired
	private user_service userService;
	
	@RequestMapping("/index")
	public String m1(@RequestParam(value="userName",defaultValue="") String username,
			@RequestParam(value="password",defaultValue="") String password,ModelMap model) {
		   model.addAttribute("username", username);
		System.out.println("password:"+password);
		System.out.println("username:"+username);
		 boolean flag = userService.getNamePass(username, password);
		if(flag){
			 return "manus"; 
		}else{ return "index";}
	}
	
}
