package ru.ddg.storage.service;

import java.util.List;

public interface CrudService<T, ID> {
    T findById(ID id);

    List<T> findAll();

//    <S extends T> S save(S entity);
    T insert(T dto);

    T update(ID id, T dto);

    boolean delete(ID Id);
}
