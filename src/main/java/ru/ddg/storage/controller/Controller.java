package ru.ddg.storage.controller;

import org.springframework.http.ResponseEntity;
import ru.ddg.storage.dto.AbstractDto;

import java.util.List;

public interface Controller<T, ID> {

    ResponseEntity<T> getById(ID id);

    ResponseEntity<List<T>> getAll();

    ResponseEntity<T> add(T dto);

    ResponseEntity<T> update(ID id, T dto);

    boolean delete(ID id);
}
