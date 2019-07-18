package com.example.demo.service;

import com.example.demo.entity.Borrow;

import java.util.List;

public interface BorrowService {
    List<Borrow> getBorrow(String userId);
    void updateBorrow(String userId,Integer bookId,Integer borrowState);
    void createBorrow(Borrow borrow);
}
