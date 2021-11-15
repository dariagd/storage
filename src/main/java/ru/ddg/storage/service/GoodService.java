package ru.ddg.storage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ddg.storage.model.entity.Good;
import ru.ddg.storage.repository.GoodRepository;

@Service
public class GoodService {

    private final GoodRepository goodRepository;

    @Autowired
    public GoodService(GoodRepository goodRepository) {
        this.goodRepository = goodRepository;
    }

    public Good addGood(Good good){
        return goodRepository.save(good);
    }

//    public Good getGood(Long id){
//        return goodRepository.findById(id).orElseThrow(() -> new RuntimeException());
//    }

}
