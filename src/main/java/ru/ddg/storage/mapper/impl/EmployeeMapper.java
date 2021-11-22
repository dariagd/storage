package ru.ddg.storage.mapper.impl;

import org.springframework.stereotype.Component;
import ru.ddg.storage.mapper.AbstractMapper;
import ru.ddg.storage.dto.EmployeeDto;
import ru.ddg.storage.entity.Employee;

@Component
public class EmployeeMapper extends AbstractMapper<Employee, EmployeeDto> {
    EmployeeMapper(){
        super(Employee.class, EmployeeDto.class);
    }
}
