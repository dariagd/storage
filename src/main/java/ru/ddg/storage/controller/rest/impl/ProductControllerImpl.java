package ru.ddg.storage.controller.rest.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.controller.rest.AbstractController;
import ru.ddg.storage.dto.ProductDto;
import ru.ddg.storage.service.impl.ProductServiceImpl;

@RestController
//@RequestMapping("/product")
public class ProductControllerImpl extends AbstractController<ProductDto, Long> {
    public ProductControllerImpl(ProductServiceImpl productService) {
        super(productService);
    }
}
