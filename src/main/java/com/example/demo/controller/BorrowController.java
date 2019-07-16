package com.example.demo.controller;

import com.example.demo.entity.Borrow;
import com.example.demo.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BorrowController {
    @Autowired
    private BorrowService borrowService;
    @GetMapping("/getBorrow")
    @ResponseBody
    public List<Borrow> getBorrow(Integer userId){
        return borrowService.getBorrow(userId);
    }
}
