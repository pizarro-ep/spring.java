package com.zero.spring.sce_java.repositories;

import java.util.List;

import com.zero.spring.sce_java.models.Productos;

public interface IProductosRepository {
    List<Productos> findAll();

    Productos findById(long id);
}
