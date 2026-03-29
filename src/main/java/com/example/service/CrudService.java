package com.example.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {
    T getById(Long id);
    List<T> getAll();
    T save(T entity);
    void deleteById(Long id);
}
