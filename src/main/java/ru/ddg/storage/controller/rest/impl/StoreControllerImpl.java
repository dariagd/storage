package ru.ddg.storage.controller.rest.impl;

import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.controller.rest.AbstractController;
import ru.ddg.storage.dto.StoreDto;
import ru.ddg.storage.service.impl.StoreServiceImpl;

@RestController
//@RequestMapping("/store")
public class StoreControllerImpl extends AbstractController<StoreDto, Long> {
    StoreControllerImpl(StoreServiceImpl storeService) {
        super(storeService);
    }
}
