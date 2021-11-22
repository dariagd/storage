package ru.ddg.storage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto extends AbstractDto{
    private String firstName;
    private String lastName;
    private String middleName;
    private String department;
}
