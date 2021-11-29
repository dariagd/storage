package ru.ddg.storage.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.controller.AbstractController;
import ru.ddg.storage.dto.GoodDto;
import ru.ddg.storage.service.impl.GoodServiceImpl;

@RestController
@RequestMapping("/good")
public class GoodControllerImpl extends AbstractController<GoodDto, Long> {
    GoodControllerImpl(GoodServiceImpl goodService) {
        super(goodService);
    }
}
