package com.cydeo.service;

import java.util.List;

public interface CRUDService<T,ID> {

    T save(T object);

    T findById(ID id);

    List<T> findAll();

    void deleteById(ID id);

}
