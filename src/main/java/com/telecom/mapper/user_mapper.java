package com.telecom.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.telecom.entity.user_entity;

public interface user_mapper {

	@Select("SELECT * FROM usermanager")
    @Results({
        @Result(property = "username",  column = "username"),
        @Result(property = "password", column = "password"),
        @Result(property = "email",  column = "email"),
        @Result(property = "grade",  column = "grade")
    })
    List<user_entity> getAll();
    
    @Select("SELECT username,password FROM usermanager")
    @Results({
        @Result(property = "username",  column = "username"),
        @Result(property = "password",  column = "password")
    })
    List<user_entity> getNamePass();

    @Select("SELECT * FROM usermanager WHERE userId = #{id}")
    @Results({
        @Result(property = "username",  column = "username"),
        @Result(property = "email",  column = "email"),
        @Result(property = "grade",  column = "grade"),
        @Result(property = "password", column = "password",javaType=Integer.class)
    })
    user_entity getOne(Integer id);

    @Insert("INSERT INTO usermanager(username,password,email,grade) VALUES(#{username}, #{password}, #{email}, #{grade})")
    void insert(user_entity user);

    @Update("UPDATE usermanager SET username=#{username},password=#{password}, email=#{email}, grade=#{grade} WHERE userId =#{id}")
    void update(user_entity user);

    @Delete("DELETE FROM usermanager WHERE userId =#{id}")
    void delete(Integer id);
}

