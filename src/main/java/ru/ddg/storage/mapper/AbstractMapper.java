package ru.ddg.storage.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import ru.ddg.storage.dto.AbstractDto;
import ru.ddg.storage.entity.AbstractEntity;

import java.util.Objects;

public abstract class AbstractMapper<E extends AbstractEntity, T extends AbstractDto> implements Mapper<E, T>{

    private final Class<E> entityClass;
    private final Class<T> dtoClass;

    @Autowired
    private ModelMapper mapper;

    protected void setMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public AbstractMapper(Class<E> entityClass, Class<T> dtoClass) {
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    @Override
    public E toEntity(T dto) {
        return Objects.isNull(dto) ? null : mapper.map(dto, entityClass);
    }

    @Override
    public T toDto(E entity) {
        return Objects.isNull(entity) ? null : mapper.map(entity, dtoClass);
    }
}
