package ru.ddg.storage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.model.dto.StorageDto;
import ru.ddg.storage.model.entity.Storehouse;
import ru.ddg.storage.service.StorageService;

@RestController
@RequestMapping("/storage")
public class StorageController {

    private final StorageService storageService;

    @Autowired
    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping
    public ResponseEntity<StorageDto> addStorage(@RequestBody final StorageDto storageDto){
        Storehouse storehouse = storageService.addStorage(Storehouse.from(storageDto));
        return new ResponseEntity<>(StorageDto.from(storehouse), HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity<List<StorageDto>> getAllStorage(){
//        List<Storage> storage = storageService.
//    }

    @GetMapping(value="{id}")
    public ResponseEntity<StorageDto> getStorage(@RequestBody final Long id){
        Storehouse storehouse = storageService.getStorage(id);
        return new ResponseEntity<>(StorageDto.from(storehouse), HttpStatus.OK);
    }


}
