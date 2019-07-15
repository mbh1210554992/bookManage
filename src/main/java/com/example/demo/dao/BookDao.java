package com.example.demo.dao;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookDao {
    List<Book> getAllBooks(@Param("bookName")String bookName);
    Book getBookById(@Param("bookId") Integer bookId);
    Integer insertBook(Book book);
    Integer deleteBookById(@Param("bookId") Integer bookId);

}
