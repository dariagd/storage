package ru.ddg.storage.controller;

import org.springframework.http.ResponseEntity;
import ru.ddg.storage.dto.AbstractDto;

import java.util.List;

public interface Controller<T, ID> {

    ResponseEntity<T> findById(ID id);

    ResponseEntity<List<T>> findAll();

    ResponseEntity<T> insert(T dto);

    ResponseEntity<T> update(ID id, T dto);

    boolean delete(ID id);
}
