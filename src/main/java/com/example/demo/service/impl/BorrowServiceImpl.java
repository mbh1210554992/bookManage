package com.example.demo.service.impl;

import com.example.demo.dao.BorrowDao;
import com.example.demo.entity.Borrow;
import com.example.demo.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BorrowServiceImpl implements BorrowService {
    @Autowired
    private BorrowDao borrowDao;
    @Override
    public List<Borrow> getBorrow(Integer userId) {
        return borrowDao.getBorrow(userId);
    }
}
