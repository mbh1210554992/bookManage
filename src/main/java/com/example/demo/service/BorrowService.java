package com.example.demo.service;

import com.example.demo.entity.Borrow;

import java.util.List;

public interface BorrowService {
    List<Borrow> getBorrow(Integer userId);
    void updateBorrow(Integer userId,Integer bookId,Integer borrowState);
}
