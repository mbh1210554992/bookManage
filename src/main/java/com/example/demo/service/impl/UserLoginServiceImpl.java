package com.example.demo.service.impl;

import com.example.demo.dao.UserLoginDao;
import com.example.demo.entity.UserVO;
import com.example.demo.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    UserLoginDao userLoginDao;
    @Override
    public UserVO getUsers(String userId, String userPassword) {
        UserVO user= userLoginDao.getUsers(userId,userPassword);
        //System.out.println(id+","+password);
      if(null!=user){
          System.out.println("登陆成功");
          return user;
      }
        System.out.println("失败");
        return null;
    }
}
