package com.example.demo.service.impl;

import com.example.demo.common.ServiceException;
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
    public List<Borrow> getBorrow(String userId) {
        return borrowDao.getBorrow(userId);
    }


    @Override
    public void updateBorrow(String userId, Integer bookId, Integer borrowState) {
        int rows = borrowDao.updateBorrow(userId,bookId,borrowState);
        if(rows<=0){
            throw new ServiceException("更新失败");
        }
    }

    @Override
    public void createBorrow(Borrow borrow) {
        int rows= borrowDao.createBorrow(borrow);
        if(rows<=0){
            throw new ServiceException("插入失败");
        }
    }

    @Override
    public void deleteBorrow(String userId, Integer bookId) {
        int rows=borrowDao.deleteBorrow(userId,bookId);
        if(rows<=0){
            throw new ServiceException("还书失败");
        }
    }
}
