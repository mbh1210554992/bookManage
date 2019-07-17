package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
     List<User> getUsers(@Param("userId") String userId);
     List<User> getAdmins(@Param("userId") String userId);
     Integer deleteUserById(@Param("userId")String userId);
     Integer addUser(User user);

}
