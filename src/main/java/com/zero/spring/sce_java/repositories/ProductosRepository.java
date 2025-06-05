package com.zero.spring.sce_java.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zero.spring.sce_java.models.Productos;

//@Component
@Repository
public class ProductosRepository implements IProductosRepository {

    List<Productos> datos;

    public ProductosRepository() {
        this.datos = Arrays.asList(
                new Productos(001L, "Producto 1", 500),
                new Productos(002L, "Producto 2", 150),
                new Productos(003L, "Producto 3", 425),
                new Productos(004L, "Producto 4", 1200));
    }

    public List<Productos> findAll() {
        return this.datos;
    }

    public Productos findById(long id) {
        return this.datos.stream().filter(p -> p.getIdProducto().equals(id)).findFirst().orElse(null);
    }
}
