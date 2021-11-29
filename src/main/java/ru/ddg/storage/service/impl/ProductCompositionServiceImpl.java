package ru.ddg.storage.service.impl;

import org.springframework.stereotype.Service;
import ru.ddg.storage.dto.ProductCompositionDto;
import ru.ddg.storage.entity.ProductComposition;
import ru.ddg.storage.mapper.impl.ProductCompositionMapper;
import ru.ddg.storage.repository.ProductCompositionRepository;
import ru.ddg.storage.service.AbstractCrudService;

@Service
public class ProductCompositionServiceImpl extends AbstractCrudService<ProductComposition, ProductCompositionDto, Long> {
    private final ProductCompositionRepository productCompositionRepository;

    public ProductCompositionServiceImpl(ProductCompositionRepository productCompositionRepository,
                                         ProductCompositionMapper productCompositionMapper) {
        super(productCompositionRepository, productCompositionMapper);
        this.productCompositionRepository = productCompositionRepository;
    }


    @Override
    public ProductCompositionDto update(Long aLong, ProductCompositionDto dto) {
        return null;
    }
}
