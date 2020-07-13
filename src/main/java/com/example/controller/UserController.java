package com.example.controller;

import com.example.annotation.DoneTime;
import com.example.entity.User;
import com.example.entity.Statistics;
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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/Springtest")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id) {
        return userService.Sel(id).toString();
    }

    @RequestMapping("/userList")
    public List<User> list() {
        List<User> userList = userService.getList();
        return userList;
    }

    @RequestMapping("/add")
    public User add(String userName, String password, String realName) {
        User user = userService.addList(userName, password, realName);
        return user;
    }

    @RequestMapping("/update")
    public User update(Integer id, String userName, String password, String realName) {
        User user=userService.updateList(id,userName,password,realName);
        return user;
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        User user=userService.deleteList(id);
    }

    @RequestMapping("/statistics")
    public List<Statistics> statistics() {
        List<Statistics> statisticsList=userService.StatisticsList();
        return statisticsList;
    }

    @RequestMapping("/getMaxUser")
    public List<Statistics> getMaxUser(Integer mingci) {
        List<Statistics> getMaxUser=userService.getMaxUser(mingci);
        return getMaxUser;
    }

}