package ru.ddg.storage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.model.dto.GoodDto;
import ru.ddg.storage.model.entity.Good;
import ru.ddg.storage.service.impl.GoodService;

@RestController
@RequestMapping("/goods")
public class GoodController {

    // почему final
    private final GoodService goodService;

    @Autowired
    public GoodController(GoodService goodService) {
        this.goodService = goodService;
    }

    @PostMapping
    public ResponseEntity<GoodDto> addGood(@RequestBody final GoodDto goodDto){
        Good good = goodService.addGood(Good.from(goodDto));
        return new ResponseEntity<>(GoodDto.from(good), HttpStatus.OK);
    }

//    @GetMapping(value="{id}")
//    public ResponseEntity<GoodDto> getGood(@PathVariable final Long id){
//        Good good = goodService.getGood(id);
//        return new ResponseEntity<>(GoodDto.from(good), HttpStatus.OK);
//    }


}
