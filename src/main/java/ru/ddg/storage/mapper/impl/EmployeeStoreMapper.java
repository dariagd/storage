package ru.ddg.storage.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.ddg.storage.dto.EmployeeStoreDto;
import ru.ddg.storage.entity.EmployeeStore;

import java.util.Objects;

@Component
public class EmployeeStoreMapper {

    private final ModelMapper mapper;

    public EmployeeStoreMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }


//    public EmployeeStoreMapper(Class<EmployeeStore> employeeStoreClass,
//                               Class<EmployeeStoreDto> employeeStoreDtoClass) {
//        this.employeeStoreClass = employeeStoreClass;
//        this.employeeStoreDtoClass = employeeStoreDtoClass;
//    }
//
//    protected void setMapper(ModelMapper mapper) {
//        this.mapper = mapper;
//    }

    public EmployeeStore toEntity(EmployeeStoreDto dto) {
        return Objects.isNull(dto) ? null : mapper.map(dto, EmployeeStore.class);
    }

    public EmployeeStoreDto toDto(EmployeeStore entity) {
        return Objects.isNull(entity) ? null : mapper.map(entity, EmployeeStoreDto.class);
    }
}
