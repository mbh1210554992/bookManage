package com.example.demo.service;

import com.example.demo.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks(String bookId);
    Book getBookById(Integer bookId);
    void updateBook(Book book);
    void insertBook(Book book);
    void deleteBookById(Integer bookId);
    void borrowBook(Integer bookId);

}
