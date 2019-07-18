package com.example.demo.dao;

import com.example.demo.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BorrowDao {
    List<Borrow> getBorrow(@Param("userId") String userId);
    List<Borrow> getPassBorrow(@Param("userId") String userId);
    Integer updateBorrow(String userId,Integer bookId,Integer borrowState);
    Integer createBorrow(Borrow borrow);
}
