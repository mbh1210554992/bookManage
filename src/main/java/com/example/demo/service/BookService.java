package com.example.demo.service;

import com.example.demo.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(Integer bookId);
    void insertBook(Book book);
    void deleteBookById(Integer bookId);


}
