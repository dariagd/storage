package ru.ddg.storage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ddg.storage.model.dto.GoodDto;
import ru.ddg.storage.model.entity.Good;
import ru.ddg.storage.repository.GoodRepository;
import ru.ddg.storage.service.GoodService;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {

    private final GoodRepository goodRepository;

    public GoodServiceImpl(GoodRepository goodRepository) {
        this.goodRepository = goodRepository;
    }

    @Override
    public GoodDto getById(Long id) {
        return null;
    }

    @Override
    public List<GoodDto> getAll() {
        return null;
    }

    @Override
    public GoodDto save(GoodDto goodDto) {
        return null;
    }

    @Override
    public GoodDto update(Long id, GoodDto goodDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
