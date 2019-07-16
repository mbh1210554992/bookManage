package com.example.demo.dao;

import com.example.demo.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BorrowDao {
    List<Borrow> getBorrow(Integer userId);
}
