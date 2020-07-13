package com.example.mapper;

import com.example.entity.BookUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import sun.text.normalizer.UBiDiProps;

import java.util.List;


@Repository
public interface BookUserMapper {

    BookUser Sel(int id);

    List<BookUser> getList();

    BookUser addList(@Param("bookId") Integer bookId,@Param("userId") Integer userId,@Param("status")Integer status,@Param("barrowTime")String barrowTime,@Param("backTime")String backTime);

    BookUser updateList(@Param("id")Integer id,@Param("bookId") Integer bookId,@Param("userId") Integer userId,@Param("status")Integer status,@Param("barrowTime")String barrowTime,@Param("backTime")String backTime);

    BookUser deleteList(int id);
}