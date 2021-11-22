package ru.ddg.storage.service;

import java.util.List;

public interface CrudService<T, ID> {
    T getById(ID id);

    List<T> getAll();

//    <S extends T> S save(S entity);
    T save(T dto);

    T update(ID id, T dto);

    boolean delete(ID Id);
}
