package ru.ddg.storage.controller.rest.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.controller.rest.AbstractController;
import ru.ddg.storage.dto.ProductCompositionDto;
import ru.ddg.storage.service.impl.ProductCompositionServiceImpl;

@RestController
//@RequestMapping("/product_composition")
public class ProductCompositionControllerImpl extends AbstractController<ProductCompositionDto, Long> {
    public ProductCompositionControllerImpl(ProductCompositionServiceImpl productCompositionService) {
        super(productCompositionService);
    }
}
