package ru.ddg.storage.model.dto;

import ru.ddg.storage.model.entity.Store;

import java.util.List;
import java.util.ArrayList;

public class StorageDto {
    private Long id;
    private String name;
    private String address;
    private List<GoodDto> goodsDto = new ArrayList<>();

    public static StorageDto from(Store store){
        StorageDto storageDto = new StorageDto();
        storageDto.setId(store.getId());
        storageDto.setName(store.getName());
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
