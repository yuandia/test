package com.example.service;

import com.example.entity.BookUser;
import com.example.mapper.BookUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookUserService {
    @Autowired
    BookUserMapper bookMapper;

    public BookUser Sel(int id){
        return bookMapper.Sel(id);
    }

    public List<BookUser> getList() {
        return bookMapper.getList();
    }

    public BookUser addList(Integer bookId,Integer userId,Integer status,String barrowTime,String backTime){
        return bookMapper.addList(bookId,userId,status,barrowTime,backTime);
    }

    public BookUser deleteList(int id){
        return bookMapper.deleteList(id);
    }

    public BookUser updateList(Integer id,Integer bookId,Integer userId,Integer status,String barrowTime,String backTime){
        return bookMapper.updateList(id,bookId,userId,status,barrowTime,backTime);
    }
}