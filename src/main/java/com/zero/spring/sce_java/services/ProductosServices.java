package com.zero.spring.sce_java.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zero.spring.sce_java.models.Productos;
import com.zero.spring.sce_java.repositories.ProductosRepository;

//@Component
@Service
public class ProductosServices implements IProductosServices {

    // private ProductosRepository repositoryProductos = new ProductosRepository();
    @Autowired
    private ProductosRepository repositoryProductos;

    @Override
    public List<Productos> findAll() {
        return repositoryProductos.findAll().stream().map(p -> {
            Double precioTotal = p.getPrecio() * 1.50d;
            // Productos newPrecio = new Productos(p.getIdProducto(), p.getNombre(),
            // precioTotal.intValue());
            // return newPrecio;
            Productos newProductos = (Productos) p.clone();
            newProductos.setPrecio(precioTotal.intValue());
            return newProductos;
        }).collect(Collectors.toList());
    }

    @Override
    public Productos findById(long id) {
        return repositoryProductos.findById(id);
    }

}
