package com.example.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Param;

public interface MyMapper {
    String selectTheFirst(@Param("tablename") String tablename);
}
