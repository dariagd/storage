package ru.ddg.storage.controller.rest.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.controller.rest.AbstractController;
import ru.ddg.storage.dto.GoodDto;
import ru.ddg.storage.service.impl.GoodServiceImpl;

@RestController
//@RequestMapping("/good")
public class GoodControllerImpl extends AbstractController<GoodDto, Long> {
    GoodControllerImpl(GoodServiceImpl goodService) {
        super(goodService);
    }
}
