package com.zero.spring.sce_java.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zero.spring.sce_java.models.Author;
import com.zero.spring.sce_java.repositories.IAuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private IAuthorRepository authorRepository;

    public List<Author> listAuthor() {
        return authorRepository.findAll();
    }

    public Optional<Author> findById(Integer id) {
        return authorRepository.findById(id);
    }

    public Author save(Author author) {
        return (Author) authorRepository.save(author);
    }

    public Author update(Integer id, Author author) {
        Author existAuthor = authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Author not found: " + id));

        return (Author) authorRepository.save(existAuthor);
    }

    public void delete(Integer id) {
        authorRepository.deleteById(id);
    }
}
