package com.example.demo.controller;

import com.example.demo.common.JsonResult;
import com.example.demo.entity.Borrow;
import com.example.demo.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/borrow")
public class BorrowController {
    @Autowired
    private BorrowService borrowService;
    @GetMapping("/getBorrow")
    @ResponseBody
    public JsonResult getBorrow(String userId){
        List<Borrow > list=borrowService.getBorrow(userId);
        return new JsonResult(list);
    }
    @RequestMapping("/updateBorrow")
    @ResponseBody
    public JsonResult updateBorrow (String userId, Integer bookId, Integer borrowState){
        borrowService.updateBorrow(userId,bookId,borrowState);
        return new JsonResult("更新成功");
    }
    @RequestMapping("/createBorrow")
    @ResponseBody
    public JsonResult createBorrow(@RequestBody Borrow borrow){
        //System.out.println(borrow);

        borrowService.createBorrow(borrow);
        return  new JsonResult("操作成功");
    }

    @RequestMapping("/deleteBorrow")
    @ResponseBody
    public JsonResult deleteBorrow(String userId,Integer bookId){
        borrowService.deleteBorrow(userId,bookId);
        return new JsonResult("还书成功");
    }



}
