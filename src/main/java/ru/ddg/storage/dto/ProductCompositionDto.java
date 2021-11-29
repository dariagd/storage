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
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class ProductCompositionDto extends AbstractDto{

    @NotBlank
    private Long amount;

    @NotEmpty
    @JsonProperty("parent_id")
    private Long parentId;

    @NotEmpty
    @JsonProperty("child_id")
    private Long childId;
}
