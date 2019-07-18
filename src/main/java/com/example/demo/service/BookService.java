package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Borrow;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks(String bookId);
    Book getBookById(Integer bookId);
    List<Book> getPassBook(String userId);
    void updateBook(Book book);
    void insertBook(Book book);
    void deleteBookById(Integer bookId);
    void borrowBook(Integer bookId);
    void returnBook(Integer bookId);
}
