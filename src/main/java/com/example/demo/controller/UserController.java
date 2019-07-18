package com.example.demo.controller;

import com.example.demo.common.JsonResult;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    @ResponseBody
    public JsonResult getUsers(String userId){
        List<User> list= userService.getUsers(userId);
        return new JsonResult(list);
    }

    @GetMapping("/getAdmins")
    @ResponseBody
    public JsonResult getAdmins(String userId){
        List<User> list= userService.getAdmins(userId);
        return new JsonResult(list);
    }


    @GetMapping("/delete/user")
    @ResponseBody
    public JsonResult deleteUserById(String userId){
        userService.deleteUserById(userId);
        return new JsonResult("删除成功");
    }
    @PostMapping("add/user")
    @ResponseBody
    public JsonResult addUser(@RequestBody User user){
        userService.addUser(user);
        return new JsonResult("添加成功");
    }

    @PostMapping("add/admin")
    @ResponseBody
    public JsonResult addAdmin(@RequestBody User user){
        userService.addAdmin(user);
        return new JsonResult("添加管理员成功");
    }


}
