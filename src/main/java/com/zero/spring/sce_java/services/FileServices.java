package com.zero.spring.sce_java.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

@Service
public class FileServices {
    public String readFile(String filePath) {
        try {
            Path path = Paths.get(filePath);
            return Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException("Error en lectura de archivo " + e.getMessage(), e);
        }
    }
}
