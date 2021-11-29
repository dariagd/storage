package ru.ddg.storage.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;


@Getter
@Setter
@Validated
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractDto implements Serializable {
    @JsonProperty("id")
    private Long id;
}
