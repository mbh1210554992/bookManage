package com.example.demo.dao;


import com.example.demo.entity.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserLoginDao {
    List<UserVO> getUsers();
}
