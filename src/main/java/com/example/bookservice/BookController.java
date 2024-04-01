package com.example.bookservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private BookMapper bookMapper;

    public BookController(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @GetMapping("/books")
    public List<Book> findByBook(BookSearchRequest request) {
        List<Book> book = bookMapper.findBook(request.getStartsWith(), request.getEndsWith(), request.getContains());
        return book;
    }
}
