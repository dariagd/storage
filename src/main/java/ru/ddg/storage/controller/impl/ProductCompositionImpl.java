package ru.ddg.storage.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.controller.AbstractController;
import ru.ddg.storage.dto.ProductCompositionDto;
import ru.ddg.storage.service.impl.ProductCompositionServiceImpl;

@RestController
@RequestMapping("/product_composition")
public class ProductCompositionImpl extends AbstractController<ProductCompositionDto, Long> {
    public ProductCompositionImpl(ProductCompositionServiceImpl productCompositionService) {
        super(productCompositionService);
    }
}
