package ru.ddg.storage.mapper;

import ru.ddg.storage.dto.AbstractDto;
import ru.ddg.storage.entity.AbstractEntity;

public interface Mapper<E extends AbstractEntity, T extends AbstractDto> {
    E toEntity(T dto);
    T toDto(E entity);
}
