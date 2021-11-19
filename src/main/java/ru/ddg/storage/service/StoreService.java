package ru.ddg.storage.service;

import ru.ddg.storage.model.dto.StoreDto;

import java.util.List;

public interface StoreService {
    StoreDto getById(Long id);
    List<StoreDto> getAll();
    StoreDto save(StoreDto goodDto);
    StoreDto update(Long id, StoreDto goodDto);
    void delete(Long id);
}
