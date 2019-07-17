package com.example.demo.service;


import com.example.demo.entity.UserVO;



public interface UserLoginService {
    UserVO getUsers(String userId, String userPassword);
}
