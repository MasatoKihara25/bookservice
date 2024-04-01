package com.example.bookservice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("SELECT * FROM books WHERE title LIKE CONCAT(#{prefix}, '%') AND title LIKE CONCAT('%',#{suffix}) AND title LIKE CONCAT('%',#{keyword},'%')")
    List<Book> findBook(String prefix, String suffix, String keyword);
}
