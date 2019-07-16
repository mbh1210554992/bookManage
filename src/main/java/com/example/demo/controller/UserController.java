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


}
