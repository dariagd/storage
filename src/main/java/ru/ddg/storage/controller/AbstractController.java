package ru.ddg.storage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.dto.AbstractDto;
import ru.ddg.storage.service.AbstractCrudService;
import ru.ddg.storage.service.CrudService;

import java.util.List;

public abstract class AbstractController<T extends AbstractDto, ID> implements Controller<T, ID>{

    private final CrudService<T, ID> crudService;

    public AbstractController(CrudService<T, ID> crudService) {
        this.crudService = crudService;
    }

    @Override
    @GetMapping("{id}")
    public ResponseEntity<T> getById(@PathVariable ID id) {
        return ResponseEntity.ok(crudService.getById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<T>> getAll() {
        return ResponseEntity.ok(crudService.getAll());
    }

    @Override
    @PostMapping
    public ResponseEntity<T> add(@RequestBody T dto) {
        return ResponseEntity.ok(crudService.save(dto));
    }

    @Override
    @PutMapping("{id}")
    public ResponseEntity<T> update(@PathVariable ID id, @RequestBody T dto) {
        return ResponseEntity.ok(crudService.update(id, dto));
    }

    @Override
    @DeleteMapping("{id}")
    public boolean delete(@PathVariable ID id) {
        crudService.delete(id);
        return true;
    }
}
