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
    public List<Borrow> getBorrow(String userId){
        return borrowService.getBorrow(userId);
    }
    @RequestMapping("/updateBorrow")
    @ResponseBody
    public JsonResult updateBorrow (Integer userId, Integer bookId, Integer borrowState){
        System.out.println(userId+" ,"+bookId+", "+borrowState);
        borrowService.updateBorrow(userId,bookId,borrowState);
        return new JsonResult("更新成功");
    }
    @RequestMapping("/createBorrow")
    @ResponseBody
    public JsonResult createBorrow( Borrow borrow){
        System.out.println(borrow);

        borrowService.createBorrow(borrow);
        return  new JsonResult("操作成功");
    }

}
