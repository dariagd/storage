package ru.ddg.storage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class GoodDto extends AbstractDto{
    @NotBlank
    private Long amount;

    private String note;

    @NotEmpty
    @JsonProperty("store_id")
    private Long storeId;

    @NotEmpty
    @JsonProperty("product_id")
    private Long productId;
}
