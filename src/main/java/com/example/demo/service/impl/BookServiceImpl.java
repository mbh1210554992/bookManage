package com.example.demo.service.impl;

import com.example.demo.common.ServiceException;
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
    public List<Book> getAllBooks(String bookName) {
        return bookDao.getAllBooks(bookName);
    }

    @Override
    public Book getBookById(Integer bookId) {
        return bookDao.getBookById(bookId);
    }

    @Override
    public List<Book> getPassBook(String userId) {
        return bookDao.getPassBook(userId);
    }

    @Override
    public void updateBook(Book book) {
        int rows = bookDao.updateBook(book);
        if(rows<=0){
            System.out.println("更新失败");
        }else {
            System.out.println("更新成功");
        }
    }

    @Override
    public void insertBook(Book book) {
        int rows=bookDao.insertBook(book);
        if(rows<=0){
            throw new ServiceException("插入失败");
        }
    }

    @Override
    public void deleteBookById(Integer bookId) {
        int rows=bookDao.deleteBookById(bookId);
        if(rows<=0) {
            throw new ServiceException("删除失败");
        }
    }

    @Override
    public void borrowBook(Integer bookId) {
        int rows=bookDao.borrowBook(bookId);
        if(rows<=0) {
            throw new ServiceException("借阅失败");
        }
    }

    @Override
    public void returnBook(Integer bookId) {
        int rows=bookDao.returnBook(bookId);
        if(rows<=0) {
            throw new ServiceException("还书失败");
        }
    }
}
