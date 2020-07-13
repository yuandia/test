package com.example.controller;

import com.example.entity.Book;
import com.example.entity.Statisticss;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/SpringtestBook")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("getBook/{id}")
    public String GetBook(@PathVariable int id) {
        return bookService.Sel(id).toString();
    }

    @RequestMapping("/BookList")
    public List<Book> list() {
        List<Book> bookList = bookService.getList();
        return bookList;
    }

   @RequestMapping("/add")
    public Book add(String name, String creatDate) {
        Book book = bookService.addList(name,creatDate);
        return book;
    }

    @RequestMapping("/update")
    public Book update(Integer id, String name, String creatDate) {
        Book book=bookService.updateList(id,name,creatDate);
        return book;
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        Book book=bookService.deleteList(id);
    }

    @RequestMapping("/getMaxBook")
    public List<Statisticss> getMaxBook(Integer mingci2) {
        List<Statisticss> getMaxBook=bookService.getMaxBook(mingci2);
        return getMaxBook;
    }
}