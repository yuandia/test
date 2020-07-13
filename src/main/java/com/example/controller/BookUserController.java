package com.example.controller;

import com.example.entity.Book;
import com.example.entity.User;
import com.example.entity.BookUser;
import com.example.service.BookService;
import com.example.service.BookUserService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/BookUsertest")
public class BookUserController {

    @Autowired
    private BookUserService bookUserService;

    @RequestMapping("getBookUser/{id}")
    public String GetUser(@PathVariable int id) {
        return bookUserService.Sel(id).toString();
    }

    @RequestMapping("/BookUserList")
    public List<BookUser> list() {
        List<BookUser> bookUserList = bookUserService.getList();
        return bookUserList;
    }

    @RequestMapping("/add")
    public String add(Integer bookId,Integer userId,Integer status,String barrowTime,String backTime) {
        BookUser bookUser = bookUserService.addList(bookId, userId, status, barrowTime, backTime);
        return "借书成功";
    }

    @RequestMapping("/addLists")
    public String addLists() {
        Integer bookId,userId,status=1;
        String barrowTime="2020-05-25",backTime="2020-06-25";
        Integer[] listuser={1,2,3,4,11,12,13,14,15,16};
        Integer[] listbook={1,2,3,4,5};
        for(int i=0;i<100000;i++){
            bookId=listbook[new Random().nextInt(listbook.length)];
            userId=listuser[new Random().nextInt(listuser.length)];
            BookUser bookUser = bookUserService.addList(bookId, userId, status, barrowTime, backTime);
        }
        return "借书成功";
    }

// @RequestMapping("/add")
//    public String add(Integer bookId,Integer userId,Integer status,String barrowTime,String backTime) {
//        for(Book book:bookService.getList()){
//            if(book.getId()==bookId){
//                for(User user:userService.getList()){
//                    if(user.getId()==userId){
//                        BookUser bookUser = bookUserService.addList(bookId,userId,status,barrowTime,backTime);
//                        return "借书成功";
//                    }
//                }
//                BookUser bookUser = bookUserService.addList(bookId,userId,status,barrowTime,backTime);
//                return "查无此人";
//            }
//        }
//        BookUser bookUser = bookUserService.addList(bookId,userId,status,barrowTime,backTime);
//        return "查无此书";
//    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        BookUser bookUser=bookUserService.deleteList(id);
    }
}