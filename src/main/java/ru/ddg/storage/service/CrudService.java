package ru.ddg.storage.service;

import java.util.List;

public interface CrudService<T, ID> {
    T getById(ID id);

    List<T> getAll();

    <S extends T> S insert(S entity);
//    T save(T dto);

    <S extends T> S update(ID id, S dto);

    boolean delete(ID Id);
}
