package com.zero.spring.sce_java.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AppController {

    @GetMapping("index")
    public ResponseEntity<?> index(HttpServletRequest request) {
        Map<String, Object> data = new HashMap<>();
        data.put("title", "Sistema de control de acceso");
        data.put("hour", new Date());
        data.put("mensaje", request.getAttribute("Mensaje"));
        return ResponseEntity.ok(data);
    }
}
