package ru.ddg.storage.service.impl;

import org.springframework.stereotype.Service;
import ru.ddg.storage.dto.ProductDto;
import ru.ddg.storage.entity.Product;
import ru.ddg.storage.mapper.AbstractMapper;
import ru.ddg.storage.mapper.impl.ProductMapper;
import ru.ddg.storage.repository.AbstractRepository;
import ru.ddg.storage.repository.ProductRepository;
import ru.ddg.storage.service.AbstractCrudService;

@Service
public class ProductServiceImpl extends AbstractCrudService<Product, ProductDto, Long> {
    public ProductServiceImpl(ProductRepository productRepository,
                              ProductMapper productMapper) {
        super(productRepository, productMapper);
    }

    @Override
    public ProductDto update(Long aLong, ProductDto dto) {
        return null;
    }
}
