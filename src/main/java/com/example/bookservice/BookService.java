package com.example.bookservice;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookMapper bookMapper;

    public BookService(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public List<Book> findBook(String prefix, String suffix, String keyword) {
        return bookMapper.findBook(prefix, suffix, keyword);
    }

    public Book findBook(int id) {
        Optional<Book> book = bookMapper.findById(id);
        if (book.isPresent()) {
            return book.get();
        } else {
            throw new BookNotFoundException("Book with id " + id + " not found");
        }
    }
}
