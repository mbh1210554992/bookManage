package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;


    @PostMapping("/login")
    @ResponseBody
    public String getUsers(@RequestBody User user){
        List<User> list= userService.getUsers();
        for(User temp : list){
            if(user.getId().equals(temp.getId()) && user.getPassword().equals(temp.getPassword())){
                System.out.println("成功");
                return "成功";
            }
        }
        System.out.println("失败");
        return "失败";


    }

}
