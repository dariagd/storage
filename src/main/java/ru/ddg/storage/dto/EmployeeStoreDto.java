package ru.ddg.storage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

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
}
