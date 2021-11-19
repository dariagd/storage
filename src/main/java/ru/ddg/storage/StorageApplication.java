package ru.ddg.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.repository.GoodRepository;
import ru.ddg.storage.repository.StorehouseRepository;

@SpringBootApplication
@RestController
@RequestMapping(value = "", produces = "application/json")
public class StorageApplication {
    private StorehouseRepository storehouseRepository;
    private GoodRepository goodRepository;

    @Autowired
    public StorageApplication(StorehouseRepository storehouseRepository, GoodRepository goodRepository) {
        this.storehouseRepository = storehouseRepository;
        this.goodRepository = goodRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }

//    @RequestMapping("create-good")
//    public Good createGood(){
//        return goodRepository.save(new Good());
//    }

//    @RequestMapping("create-storage")
//    public Storehouse createStorage(){
//        return storehouseRepository.save(new Storehouse());
//    }


}
