package com.zero.spring.sce_java.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/saludo")
public class Saludo {

    @GetMapping()
    public String saludar() throws InterruptedException {
        Thread.sleep(500);
        return "Saludar a todos";
    }

}
