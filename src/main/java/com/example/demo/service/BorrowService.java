package com.example.demo.service;

import com.example.demo.entity.Borrow;

import java.util.List;

public interface BorrowService {
    List<Borrow> getBorrow(String userId);
    void updateBorrow(Integer userId,Integer bookId,Integer borrowState);
}
