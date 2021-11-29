package ru.ddg.storage.service;

import ru.ddg.storage.mapper.AbstractMapper;
import ru.ddg.storage.dto.AbstractDto;
import ru.ddg.storage.entity.AbstractEntity;
import ru.ddg.storage.repository.AbstractRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractCrudService<E extends AbstractEntity, T extends AbstractDto, ID extends Number> implements CrudService<T, ID>{

    private final AbstractRepository<E, ID> abstractRepository;
    private final AbstractMapper<E, T> abstractMapper;

    public AbstractCrudService(AbstractRepository<E, ID> abstractRepository,
                               AbstractMapper<E, T> abstractMapper) {
        this.abstractRepository = abstractRepository;
        this.abstractMapper = abstractMapper;
    }

    @Override
    public T getById(ID id) {
        return abstractMapper.toDto(abstractRepository.findById(id).orElseThrow(() -> new RuntimeException()));
    }

    @Override
    public List<T> getAll() {
        System.out.println(abstractRepository.findAll());
        return abstractRepository.findAll()
                .stream()
                .map(entity -> abstractMapper.toDto(entity))
                // or map(abstractMapper::toDto)
                .collect(Collectors.toList());
    }

    // в каждом сервисе-реализации переопределить update()

    @Override
    public <S extends T> S insert(S dto) {
        return (S) abstractMapper.toDto(abstractRepository.save(abstractMapper.toEntity(dto)));
    }

    @Override
    public boolean delete(ID id) {
        abstractRepository.deleteById(id);
        return true;
    }
}
