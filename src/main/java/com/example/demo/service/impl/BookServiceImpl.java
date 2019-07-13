package com.example.demo.service.impl;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl<insertBook> implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public Book getBookById(Integer bookId) {
        return bookDao.getBookById(bookId);
    }

    @Override
    public void insertBook(Book book) {
        int rows=bookDao.insertBook(book);
        if(rows<=0){
            System.out.println("插入失败！");
        }else{
            System.out.println("插入成功");
        }
    }

    @Override
    public void deleteBookById(Integer bookId) {
        int rows=bookDao.deleteBookById(bookId);
        if(rows<=0){
            System.out.println("删除失败！");
        }else{
            System.out.println("删除成功");
        }
    }
}
