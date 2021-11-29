package ru.ddg.storage.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@Validated
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeStoreDto{

    @NotEmpty
    private Long employeeId;

    @NotEmpty
    private Long storeId;

    @NotBlank
    private Date expirationDate;
}
