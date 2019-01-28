package com.zmj.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zmj.pojo.dao.User;

@Mapper
public interface UserMapper {
	
	@Select("select id,name,age from User where id=1")
	User selectUser();
}
