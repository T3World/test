package com.zmj.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zmj.pojo.dao.User;

@FeignClient(value="zmj-provider-helloworld")
public interface UserService {
	
	@RequestMapping(value="/user/select",method=RequestMethod.GET)
	public User selectUser();
}
