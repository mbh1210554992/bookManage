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

    @Override
    public void updateBorrow(Integer userId, Integer bookId, Integer borrowState) {
        Integer rows = borrowDao.updateBorrow(userId,bookId,borrowState);
        if(rows<=0){
            System.out.println("更新失败");
        }else {
            System.out.println("更新成功");
        }
    }
}
