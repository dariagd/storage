package ru.ddg.storage.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.controller.AbstractController;
import ru.ddg.storage.dto.ProductCompositionDto;
import ru.ddg.storage.service.impl.ProductCompositionServiceImpl;

@RestController
@RequestMapping("/product_composition")
public class ProductCompositionControllerImpl extends AbstractController<ProductCompositionDto, Long> {
    public ProductCompositionControllerImpl(ProductCompositionServiceImpl productCompositionService) {
        super(productCompositionService);
    }
}
