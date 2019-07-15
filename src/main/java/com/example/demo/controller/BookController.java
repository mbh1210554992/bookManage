package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/getBooks")
    @ResponseBody
    public List<Book> getBooks( String bookName){

        List<Book> bookList=bookService.getAllBooks(bookName);
        return bookList;
    }
    @GetMapping("/getBookById")
    @ResponseBody
    public Book getBookById(@RequestBody Integer bookId){
        Book book=bookService.getBookById(bookId);
        return book;
    }

    @PostMapping("/addBook")
    @ResponseBody
    public Integer insertBook(@RequestBody Book book){
        System.out.println("插入图书");
        bookService.insertBook(book);
        return 1;
    }
    @RequestMapping("/deleteBookById")
    @ResponseBody
    public Integer deleteBookById(@RequestParam() Integer bookId){
         bookService.deleteBookById(bookId);
         return 1;
    }
}
