package com.example.service;

import com.example.entity.Book;
import com.example.entity.Statisticss;
import com.example.mapper.BooksMapper;
import com.example.mapper.StatisticssMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BooksMapper bookMapper;

    @Autowired
    StatisticssMapper statisticssMapper;

    public Book Sel(int id){
        return bookMapper.Sel(id);
    }

    public List<Book> getList() {
        return bookMapper.getList();
    }

    public Book addList(String name,String creatDate){
        return bookMapper.addList(name,creatDate);
    }

    public Book deleteList(int id){
        return bookMapper.deleteList(id);
    }

    public Book updateList(Integer id, String name, String creatDate){
        return bookMapper.updateList(id,name,creatDate);
    }

    public List<Statisticss> getMaxBook(Integer mingci2){
        return statisticssMapper.getMaxBook(mingci2);
    }
}