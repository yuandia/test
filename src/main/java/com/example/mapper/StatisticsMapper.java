package com.example.mapper;

import com.example.entity.Statistics;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatisticsMapper {
    List<Statistics> getList();

    List<Statistics> getMaxUser(@Param("mingci") Integer mingci);
}