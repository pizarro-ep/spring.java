package com.zero.spring.sce_java.services;

import java.util.List;

import com.zero.spring.sce_java.models.Productos;

public interface IProductosServices {

    List<Productos> findAll();

    Productos findById(long id);

}
