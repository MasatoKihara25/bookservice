package com.example.bookservice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("SELECT * FROM books")
    List<Book> findAll();
}
