package ru.ddg.storage.service.impl;

import org.springframework.stereotype.Service;
import ru.ddg.storage.dto.StoreDto;
import ru.ddg.storage.entity.Store;
import ru.ddg.storage.mapper.AbstractMapper;
import ru.ddg.storage.mapper.impl.StoreMapper;
import ru.ddg.storage.repository.AbstractRepository;
import ru.ddg.storage.repository.StoreRepository;
import ru.ddg.storage.service.AbstractCrudService;

@Service
public class StoreServiceImpl extends AbstractCrudService<Store, StoreDto, Long> {

    private final StoreRepository storeRepository;
    private final StoreMapper storeMapper;

    public StoreServiceImpl(StoreRepository storeRepository, StoreMapper storeMapper) {
        super(storeRepository, storeMapper);
        this.storeRepository = storeRepository;
        this.storeMapper = storeMapper;
    }

    @Override
    public StoreDto update(Long id, StoreDto dto) {
        return storeRepository.findById(id)
                .map(store -> {
                    store.setName(dto.getName());
                    store.setAddress(dto.getAddress());
                    return storeMapper.toDto(storeRepository.save(store));
                })
                .orElseGet(() -> {
                    dto.setId(id);
                    return storeMapper.toDto(storeRepository.save(storeMapper.toEntity(dto)));
                });
    }
}

