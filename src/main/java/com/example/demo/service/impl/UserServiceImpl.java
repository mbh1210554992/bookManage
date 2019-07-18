package com.example.demo.service.impl;



import com.example.demo.common.ServiceException;
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
    public List<User> getUsers(String userId) {

        List<User> userList = userDao.getUsers(userId);

        return userList;
    }

    @Override
    public List<User> getAdmins(String userId) {
        List<User> adminList = userDao.getAdmins(userId);

        return adminList;
    }

    @Override
    public void deleteUserById(String userId) {
        int rows = userDao.deleteUserById(userId);
        if(rows<=0){
            throw new ServiceException("删除失败");
        }
    }

    @Override
    public void addUser(User user) {
        int rows= userDao.addUser(user);
        if(rows<=0){
            throw new ServiceException("添加失败");
        }
    }

    @Override
    public void addAdmin(User user) {
        int rows= userDao.addAdmin(user);
        if(rows<=0){
            throw new ServiceException("添加失败");
        }
    }
}
