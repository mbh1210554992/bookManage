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
    public List<Book> getBooks(){
        List<Book> bookList=bookService.getAllBooks();
        return bookList;
    }
    @GetMapping("/getBookById")
    @ResponseBody
    public Book getBookById(@RequestBody Integer bookId){
        Book book=bookService.getBookById(bookId);
        return book;
    }

    @PutMapping("/insertBook")
    @ResponseBody
    public Integer insertBook(){
        Book book=new Book();
        book.setBookName("三国演义");
        book.setBookAuthor("罗贯中");
        book.setBookIsbn("54541321");
        book.setBookStatus(0);
        bookService.insertBook(book);
        return 1;
    }
    @DeleteMapping("/deleteBookById")
    @ResponseBody
    public Integer deleteBookById(@RequestBody Integer bookId){
         bookService.deleteBookById(bookId);
         return 1;
    }
}
