package com.zero.spring.sce_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zero.spring.sce_java.models.Author;

@Repository
public interface IAuthorRepository extends JpaRepository<Author, Integer> {

}
