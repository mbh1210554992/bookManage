package com.example.demo.controller;

import com.example.demo.common.JsonResult;
import com.example.demo.entity.Borrow;
import com.example.demo.service.BorrowService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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

    @RequestMapping("/get/passBorrow")
    @ResponseBody
    public JsonResult getPassBorrow(String userId,Integer bookId){
        List<Borrow> list=borrowService.getPassBorrow(userId,bookId);
        return new JsonResult(list);
    }

}
