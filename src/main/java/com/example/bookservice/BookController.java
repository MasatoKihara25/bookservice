package com.example.bookservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> findByBook(BookSearchRequest request) {
        List<Book> book = bookService.findBook(request.getStartsWith(), request.getEndsWith(), request.getContains());
        return book;
    }

    @GetMapping("/books/{id}")
    public Book findBook(@PathVariable("id") int id) {
        return bookService.findBook(id);
    }

}
