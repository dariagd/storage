package ru.ddg.storage.mapper.impl;

import org.springframework.stereotype.Component;
import ru.ddg.storage.dto.EmployeeStoreDto;
import ru.ddg.storage.entity.EmployeeStore;
import ru.ddg.storage.mapper.AbstractMapper;

@Component
public class EmployeeStoreMapper extends AbstractMapper<EmployeeStore, EmployeeStoreDto> {
    EmployeeStoreMapper() {
        super(EmployeeStore.class, EmployeeStoreDto.class);
    }
}
