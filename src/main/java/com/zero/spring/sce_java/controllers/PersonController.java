package com.zero.spring.sce_java.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.zero.spring.sce_java.entities.PersonEntity;
import com.zero.spring.sce_java.interceptors.PersonRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping()
    public List<PersonEntity> query() {
        return (List<PersonEntity>) personRepository.findAll();
    }

}
