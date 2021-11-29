package ru.ddg.storage.mapper.impl;

import org.springframework.stereotype.Component;
import ru.ddg.storage.dto.ProductCompositionDto;
import ru.ddg.storage.entity.ProductComposition;
import ru.ddg.storage.mapper.AbstractMapper;

@Component
public class ProductCompositionMapper extends AbstractMapper<ProductComposition, ProductCompositionDto> {
    public ProductCompositionMapper() {
        super(ProductComposition.class, ProductCompositionDto.class);
    }
}
