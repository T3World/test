package com.zmj.controller;

import com.zmj.pojo.dao.User;
import com.zmj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/select",method=RequestMethod.GET)
	public User selectUser() {
		return this.userService.selectUser();
	}
	
}
