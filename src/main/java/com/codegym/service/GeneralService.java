package com.codegym.service;

import java.util.List;

public interface GeneralService<T> {

    Iterable<T> findAll();

    void save(T t);

    Iterable<T> findByName(String name);

    void remove(Long id);

    T findById(Long id);
}
