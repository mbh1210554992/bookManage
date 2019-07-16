package com.example.demo.service.impl;



import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {

        List<User> userList = userDao.getUsers();

        return userList;
    }

    @Override
    public void deleteUserById(Integer userId) {
        int rows = userDao.deleteUserById(userId);
        if(rows<=0){
            System.out.println("删除失败！");
        }else{
            System.out.println("删除成功");
        }
    }
}
