package ru.ddg.storage.service.impl;

import org.springframework.stereotype.Service;
import ru.ddg.storage.dto.GoodDto;
import ru.ddg.storage.entity.Good;
import ru.ddg.storage.mapper.impl.GoodMapper;
import ru.ddg.storage.repository.GoodRepository;
import ru.ddg.storage.service.AbstractCrudService;


@Service
public class GoodServiceImpl extends AbstractCrudService<Good, GoodDto, Long> {

    private final GoodRepository goodRepository;
    private final GoodMapper goodMapper;

    public GoodServiceImpl(GoodRepository goodRepository, GoodMapper goodMapper) {
        super(goodRepository, goodMapper);
        this.goodRepository = goodRepository;
        this.goodMapper = goodMapper;
    }

    @Override
    public GoodDto update(Long id, GoodDto dto) {
        return goodRepository.findById(id)
                .map(good -> {
                    good.setAmount(dto.getAmount());
                    good.setNote(dto.getNote());
                    return goodMapper.toDto(goodRepository.save(good));
                })
                .orElseGet(() -> {
                    dto.setId(id);
                    return goodMapper.toDto(goodRepository.save(goodMapper.toEntity(dto)));
                });
    }
}
