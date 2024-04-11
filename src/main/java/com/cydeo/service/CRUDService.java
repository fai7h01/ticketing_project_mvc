package com.cydeo.service;

import java.util.List;

public interface CRUDService<T,ID> {

    T save(T user);

    T findById(ID username);

    List<T> findAll();

    void deleteById(ID username);

}
