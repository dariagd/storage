package ru.ddg.storage.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class StoreDto {
    private Long id;
    private String name;
    private String address;
    private List<GoodDto> goodsDto = new ArrayList<>();
}
