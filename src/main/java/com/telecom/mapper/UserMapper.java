package com.telecom.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.telecom.entity.UserEntity;

public interface UserMapper {

	@Select("SELECT * FROM user")
    @Results({
        @Result(property = "userName",  column = "name"),
        @Result(property = "age", column = "age")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
        @Result(property = "userName",  column = "name"),
        @Result(property = "age", column = "age",javaType=Integer.class)
    })
    UserEntity getOne(Long id);

    @Insert("INSERT INTO user(name,age) VALUES(#{userName}, #{age})")
    void insert(UserEntity user);

    @Update("UPDATE user SET name=#{userName},age=#{age} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);
}
