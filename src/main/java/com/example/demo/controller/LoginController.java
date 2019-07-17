package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;


    @GetMapping("/login")
    @ResponseBody
    public User getUsers(String id,String password){
        List<User> list= userService.getUsers();
        //System.out.println(id+","+password);
        for(User temp : list){
            if(temp.getId().equals(id) && temp.getPassword().equals(password)){
                System.out.println("成功");
                return temp;
            }
        }
        System.out.println("失败");
        return null;


    }

}
