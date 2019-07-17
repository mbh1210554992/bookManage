package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
     List<User> getUsers();
     Integer deleteUserById(Integer userId);
     Integer addUser(User user);

}
