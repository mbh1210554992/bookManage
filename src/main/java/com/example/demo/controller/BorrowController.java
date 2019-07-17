package com.example.demo.controller;

import com.example.demo.entity.Borrow;
import com.example.demo.service.BorrowService;
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
    public Integer updateBorrow (  Integer userId, Integer bookId, Integer borrowState){
        System.out.println(userId+" ,"+bookId+", "+borrowState);
        borrowService.updateBorrow(userId,bookId,borrowState);
        return 1;
    }

}
