package ru.ddg.storage.service;

import ru.ddg.storage.model.dto.GoodDto;
import java.util.List;

public interface GoodService {
    GoodDto getById(Long id);
    List<GoodDto> getAll();
    GoodDto save(GoodDto goodDto);
    GoodDto update(Long id, GoodDto goodDto);
    void delete(Long id);
}
