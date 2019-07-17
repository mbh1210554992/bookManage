package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    @ResponseBody
    public List<User> getUsers(){
        List<User> list= userService.getUsers();
        return list;
    }

    @PostMapping("/delete/user")
    @ResponseBody
    public String deleteUserById(Integer userId){
        userService.deleteUserById(userId);
        return null;
    }
    @GetMapping("add/user")
    @ResponseBody
    public String addUser(/*User user*/){
        User user =new User();
        user.setAddress("北京");
        user.setAge(10);
        user.setId("mnh");
        user.setPhone(1512312131);
        user.setSex("男");
        user.setName("张武");
        user.setPassword("123456");
        userService.addUser(user);
        return "ok";
    }


}
