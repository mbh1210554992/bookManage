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
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    @ResponseBody
    public List<User> getUsers(String userId){
        List<User> list= userService.getUsers(userId);
        return list;
    }

    @GetMapping("/getAdmins")
    @ResponseBody
    public List<User> getAdmins(String userId){
        List<User> list= userService.getAdmins(userId);
        return list;
    }


    @PostMapping("/delete/user")
    @ResponseBody
    public String deleteUserById(String userId){
        userService.deleteUserById(userId);
        return null;
    }
    @PostMapping("add/user")
    @ResponseBody
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "ok";
    }


}
