package ru.ddg.storage.mapper.impl;

import org.springframework.stereotype.Component;
import ru.ddg.storage.dto.GoodDto;
import ru.ddg.storage.entity.Good;
import ru.ddg.storage.mapper.AbstractMapper;

@Component
public class GoodMapper extends AbstractMapper<Good, GoodDto> {
    GoodMapper() {
        super(Good.class, GoodDto.class);
    }
}
