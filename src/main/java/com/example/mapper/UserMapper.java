package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User Sel(int id);

    List<User> getList();

    User addList(@Param("userName") String userName,@Param("password") String password, @Param("realName")String realName);

    User updateList(@Param("id")Integer id, @Param("userName") String userName,@Param("password") String password, @Param("realName")String realName);

    User deleteList(int id);

}