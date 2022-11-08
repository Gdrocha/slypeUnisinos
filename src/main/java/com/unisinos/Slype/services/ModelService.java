package com.unisinos.Slype.services;

import com.unisinos.Slype.models.Model;

import java.util.List;

public interface ModelService<T extends Model> {
    List<T> findAll();

    T findById(long id);

    T save(T model);

    void delete(T model);
}
