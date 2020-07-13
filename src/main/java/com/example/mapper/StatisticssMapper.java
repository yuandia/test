package com.example.mapper;

import com.example.entity.Statisticss;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatisticssMapper {

    List<Statisticss> getMaxBook(@Param("mingci2") Integer mingci2);
}