package ru.ddg.storage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ddg.storage.model.entity.Store;
import ru.ddg.storage.repository.StorehouseRepository;
import ru.ddg.storage.service.impl.GoodService;

import java.util.List;

@Service
public class StorageService {

    private final StorehouseRepository storehouseRepository;

    private final GoodService goodService;

    @Autowired
    public StorageService(StorehouseRepository storehouseRepository, GoodService goodService) {
        this.storehouseRepository = storehouseRepository;
        this.goodService = goodService;
    }

    public Store addStorage(Store store){
        return storehouseRepository.save(store);
    }

    public Store getStorage(Long id){
        return storehouseRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Store> getAllStorage(){
        return storehouseRepository.findAll();
    }

//    public Storehouse addGoodToTheStorage(Long storageId, Long goodId){
//        Storehouse storehouse = getStorage(storageId);
//        Good good = goodService.getGood(goodId);
//        if(Objects.nonNull(good.getStorehouse())){
//            throw new RuntimeException();
//        }
//        storehouse.addGood(good);
//        return storehouse;
//    }
}
