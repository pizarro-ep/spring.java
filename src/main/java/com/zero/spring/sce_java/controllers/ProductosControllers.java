package com.zero.spring.sce_java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zero.spring.sce_java.models.Productos;
import com.zero.spring.sce_java.services.IProductosServices;

@RestController
@RequestMapping("/api")
public class ProductosControllers {

    // private ProductosServices productosServices = new ProductosServices();
    @Autowired
    private IProductosServices productosServices;

    @GetMapping()
    public List<Productos> ListProductos() {
        // ProductosServices productosServices = new ProductosServices();
        return productosServices.findAll();
    }

    @GetMapping("{id}")
    public Productos view(@PathVariable int id) {
        // ProductosServices productosServices = new ProductosServices();
        return productosServices.findById(id);
    }

}
