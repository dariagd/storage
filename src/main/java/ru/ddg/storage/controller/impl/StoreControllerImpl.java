package ru.ddg.storage.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.controller.AbstractController;
import ru.ddg.storage.dto.StoreDto;
import ru.ddg.storage.service.impl.StoreServiceImpl;

@RestController
@RequestMapping("/store_list")
public class StoreControllerImpl extends AbstractController<StoreDto, Long> {
    StoreControllerImpl(StoreServiceImpl storeService) {
        super(storeService);
    }
}
