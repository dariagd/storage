package ru.ddg.storage.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GoodDto {
    private Long id;
    private Long amount;
    private String note;
}
