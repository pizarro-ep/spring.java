package com.zero.spring.sce_java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zero.spring.sce_java.models.Book;
import com.zero.spring.sce_java.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping()
    public ResponseEntity<List<Book>> listAll() {
        List<Book> books = bookService.listBook();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

}
