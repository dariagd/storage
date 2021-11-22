package ru.ddg.storage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoodDto extends AbstractDto{
    private Long amount;
    private String note;
    @JsonProperty("store_id")
    private Long storeId;
    @JsonProperty("product_id")
    private Long productId;
}
