package com.zero.spring.sce_java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zero.spring.sce_java.models.Author;
import com.zero.spring.sce_java.services.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping()
    public ResponseEntity<List<Author>> listAll() {
        List<Author> authors = authorService.listAuthor();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

}
