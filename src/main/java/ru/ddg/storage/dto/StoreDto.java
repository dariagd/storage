package ru.ddg.storage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.ArrayList;

@Getter
@Setter
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class StoreDto extends AbstractDto {

    @NotBlank
    private String name;

    @NotBlank
    private String address;
}
