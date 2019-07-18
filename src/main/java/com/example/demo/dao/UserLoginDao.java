package com.example.demo.dao;


import com.example.demo.entity.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserLoginDao {
    UserVO getUsers(@Param("userId") String UserId, @Param("userPassword") String userPassword);
}
