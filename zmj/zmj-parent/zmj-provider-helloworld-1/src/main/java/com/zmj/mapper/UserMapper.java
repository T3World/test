package com.zmj.mapper;

import com.zmj.pojo.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	
	@Select("select id,name,age from User where id=1")
    User selectUser();
}
