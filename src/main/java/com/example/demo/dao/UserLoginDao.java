package com.example.demo.dao;


import com.example.demo.entity.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserLoginDao {
    UserVO getUsers(@Param("userId") String UserId, @Param("userPassword") String userPassword);
}
