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
        List<UserVO> list= userLoginDao.getUsers();
        //System.out.println(id+","+password);
        for(UserVO temp : list){
            if(temp.getUserId().equals(userId) && temp.getUserPassword().equals(userPassword)){
                System.out.println("成功");
                System.out.println(temp);
                return temp;
            }
        }
        System.out.println("失败");
        return null;
    }
}
