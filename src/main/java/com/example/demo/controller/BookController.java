package com.example.demo.controller;

import com.example.demo.common.JsonResult;
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
    public JsonResult getBooks(String bookName){

        List<Book> bookList=bookService.getAllBooks(bookName);
        return new JsonResult(bookList);
    }
    @GetMapping("/getBookById")
    @ResponseBody
    public JsonResult getBookById(@RequestBody Integer bookId){
        Book book=bookService.getBookById(bookId);
        return new JsonResult(book);
    }

    @PostMapping("/addBook")
    @ResponseBody
    public JsonResult insertBook(@RequestBody Book book){
        System.out.println("插入图书");
        bookService.insertBook(book);
        return new JsonResult("插入成功");
    }
    @RequestMapping("/deleteBookById")
    @ResponseBody
    public JsonResult deleteBookById(@RequestParam() Integer bookId){
         bookService.deleteBookById(bookId);
         return new JsonResult("删除成功");
    }
    @RequestMapping("/updateBook")
    @ResponseBody
    public JsonResult updateBook(@RequestBody Book book){
        bookService.updateBook(book);
        return new JsonResult("更新成功");
    }

    @RequestMapping("/borrowBook")
    @ResponseBody
    public JsonResult borrowBook(Integer bookId){
        bookService.borrowBook(bookId);
        return new JsonResult("借阅待审核");
    }
}
