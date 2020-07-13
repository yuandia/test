package com.example.mapper;

import com.example.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksMapper {

    Book Sel(int id);

    List<Book> getList();

    Book addList(@Param("name") String name,@Param("creatDate") String creatDate);

    Book updateList(@Param("id")Integer id, @Param("name") String name,@Param("creatDate") String creatDate);

    Book deleteList(int id);
}
