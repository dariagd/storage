package ru.ddg.storage.service;

import ru.ddg.storage.model.dto.EmployeeDto;
import ru.ddg.storage.model.entity.Employee;
import java.util.List;

public interface EmployeeService {
     EmployeeDto getById(Long id);

     EmployeeDto save(EmployeeDto employeeDto);

     void delete(Long Id);

     List<EmployeeDto> getAll();

     EmployeeDto update(Long id, EmployeeDto newEmployeeDto);
}
