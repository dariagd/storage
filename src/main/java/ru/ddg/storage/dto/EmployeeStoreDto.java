package ru.ddg.storage.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@Validated
@NoArgsConstructor
@RequiredArgsConstructor
public class EmployeeStoreDto{

    @NotEmpty
    @NonNull
    @JsonIgnore
    private Long employeeId;

    @NotEmpty
    @NonNull
    @JsonIgnore
    private Long storeId;

//    private Date expirationDate;
}
