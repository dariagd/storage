package ru.ddg.storage;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.repository.GoodRepository;
import ru.ddg.storage.repository.StoreRepository;

@SpringBootApplication
public class StorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
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
