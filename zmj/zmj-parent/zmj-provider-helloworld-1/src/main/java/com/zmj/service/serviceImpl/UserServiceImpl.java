package com.zmj.service.serviceImpl;

import com.zmj.mapper.UserMapper;
import com.zmj.pojo.dao.User;
import com.zmj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	private UserMapper userMapper;
	
	@Autowired
	public UserServiceImpl(UserMapper userMapper) {
		super();
		this.userMapper = userMapper;
	}


	@Override
	public User selectUser() {
		return this.userMapper.selectUser();
	}

}
