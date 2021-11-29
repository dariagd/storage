package ru.ddg.storage.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.controller.AbstractController;
import ru.ddg.storage.dto.ProductDto;
import ru.ddg.storage.service.impl.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductControllerImpl extends AbstractController<ProductDto, Long> {
    public ProductControllerImpl(ProductServiceImpl productService) {
        super(productService);
    }
}
