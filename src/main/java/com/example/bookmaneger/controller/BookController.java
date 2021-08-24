package com.example.bookmaneger.controller;

import com.example.bookmaneger.entity.Book;
import com.example.bookmaneger.dto.MessageResponseDTO;
import com.example.bookmaneger.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bookmaneger.repository.Bookrepository;

@RestController
@RequestMapping("/api/vi/livros")
public class BookController {


    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        return bookService.create(book);
    }
}
