package com.example.springbootmb.dao;

import com.example.springbootmb.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from user where name = #{name}")
    User findUserByName(@Param("name")String name);

}
