package ru.ddg.storage.mapper.impl;

import org.springframework.stereotype.Component;
import ru.ddg.storage.dto.StoreDto;
import ru.ddg.storage.entity.Store;
import ru.ddg.storage.mapper.AbstractMapper;

@Component
public class StoreMapper extends AbstractMapper<Store, StoreDto> {
    StoreMapper() {
        super(Store.class, StoreDto.class);
    }
}
