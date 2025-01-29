package com.junior.model.interfaces;

import java.util.List;

public interface Repository<T, TId> {

    void add(T item);

    void update(T item);

    void delete(T item);

    T getById(TId id);

    List<T> getAll();

}
