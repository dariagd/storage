package ru.ddg.storage.mapper.impl;

import org.springframework.stereotype.Component;
import ru.ddg.storage.dto.ProductDto;
import ru.ddg.storage.entity.Product;
import ru.ddg.storage.mapper.AbstractMapper;

@Component
public class ProductMapper extends AbstractMapper<Product, ProductDto> {
    public ProductMapper() {
        super(Product.class, ProductDto.class);
    }
}
