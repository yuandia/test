package com.example.service;

import com.example.entity.Statisticss;
import com.example.entity.User;
import com.example.entity.Statistics;
import com.example.mapper.StatisticsMapper;
import com.example.mapper.StatisticssMapper;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    StatisticsMapper statisticsMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }

    public List<User> getList() {
        return userMapper.getList();
    }

    public User addList(String userName,String password,String realName){
        return userMapper.addList(userName,password,realName);
    }

    public User deleteList(int id){
        return userMapper.deleteList(id);
    }

    public User updateList(Integer id, String userName, String password, String realName){
        return userMapper.updateList(id,userName,password,realName);
    }

    public List<Statistics> StatisticsList(){
        return statisticsMapper.getList();
    }

    public List<Statistics> getMaxUser(Integer mingci){
        return statisticsMapper.getMaxUser(mingci);
    }
}