package com.zero.spring.sce_java.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zero.spring.sce_java.services.FileServices;

@RestController
@RequestMapping("/file")
public class FileController {

    private final FileServices content;

    public FileController(FileServices content) {
        this.content = content;

    }

    @GetMapping("/read")
    public ResponseEntity<String> readFile(@RequestParam String filePath) {
        try {
            String content = this.content.readFile(filePath);
            return ResponseEntity.ok(content);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error de lectura de archivo" + e.getMessage());
        }
    }

}
