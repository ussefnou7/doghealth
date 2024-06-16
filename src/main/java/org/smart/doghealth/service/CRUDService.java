package org.smart.doghealth.service;

import java.util.Set;

public interface CRUDService<T,ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T object);

    void deleteById(ID id);
}