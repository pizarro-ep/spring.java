package com.zero.spring.sce_java.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zero.spring.sce_java.models.Author;
import com.zero.spring.sce_java.models.Book;
import com.zero.spring.sce_java.repositories.IBookRepository;

@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;

    public List<Book> listBook() {
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Integer id) {
        return bookRepository.findById(id);
    }

    public Book save(Book book) {
        return (Book) bookRepository.save(book);
    }

    public Book update(Integer id, Book author) {
        Book existBook = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found: " + id));

        return (Book) bookRepository.save(existBook);
    }

    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}
