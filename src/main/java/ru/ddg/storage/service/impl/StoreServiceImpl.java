package ru.ddg.storage.service.impl;

import org.springframework.stereotype.Service;
import ru.ddg.storage.model.dto.StoreDto;
import ru.ddg.storage.model.entity.Store;
import ru.ddg.storage.repository.StoreRepository;
import ru.ddg.storage.service.StoreService;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public StoreDto getById(Long id) {
        return null;
    }

    @Override
    public List<StoreDto> getAll() {
        return null;
    }

    @Override
    public StoreDto save(StoreDto goodDto) {
        return null;
    }

    @Override
    public StoreDto update(Long id, StoreDto goodDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
