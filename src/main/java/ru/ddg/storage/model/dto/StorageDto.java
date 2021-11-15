package ru.ddg.storage.model.dto;

import ru.ddg.storage.model.entity.Storehouse;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StorageDto {
    private Long id;
    private String name;
    private String address;
    private List<GoodDto> goodsDto = new ArrayList<>();

    public static StorageDto from(Storehouse storehouse){
        StorageDto storageDto = new StorageDto();
        storageDto.setId(storehouse.getId());
        storageDto.setName(storehouse.getName());
//        storageDto.setGoodsDto(storehouse.getGoods()
//                                    .stream()
//                                    .map(goods -> GoodDto.from(goods))
//                                    .collect(Collectors.toList()));
        return storageDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<GoodDto> getGoodsDto() {
        return goodsDto;
    }

    public void setGoodsDto(List<GoodDto> goodsDto) {
        this.goodsDto = goodsDto;
    }
}
