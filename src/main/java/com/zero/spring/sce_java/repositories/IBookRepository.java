package com.zero.spring.sce_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zero.spring.sce_java.models.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {

}
