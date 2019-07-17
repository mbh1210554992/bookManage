package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.entity.UserVO;
import com.example.demo.service.UserLoginService;
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
    private UserLoginService userLoginService;


    @GetMapping("/login")
    @ResponseBody
    public UserVO getUsers(String id, String password){

        return userLoginService.getUsers(id,password);


    }

}
