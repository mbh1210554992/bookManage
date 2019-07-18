package com.example.demo.controller;

import com.example.demo.common.JsonResult;
import com.example.demo.entity.User;
import com.example.demo.entity.UserVO;
import com.example.demo.service.UserLoginService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserLoginService userLoginService;


    @GetMapping("/login")
    @ResponseBody
    public JsonResult getUsers(String id, String password){
        UserVO user=userLoginService.getUsers(id,password);
        return new JsonResult(user);


    }

}
