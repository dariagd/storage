package ru.ddg.storage.service.impl;

import org.springframework.stereotype.Service;
import ru.ddg.storage.model.dto.EmployeeDto;
import ru.ddg.storage.model.entity.Employee;
import ru.ddg.storage.repository.EmployeeRepository;
import ru.ddg.storage.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto getById(Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        return convertEmployeeToEmployeeDto(employeeOptional.orElse(null));
    }

    // атрибут должен передаваться, но не изменяться
    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        Employee employee = employeeRepository.save(convertEmployeeDtoToEmployee(employeeDto));
        return convertEmployeeToEmployeeDto(employee);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<EmployeeDto> getAll() {
        List<Employee> employees = employeeRepository.findAll();
        return convertEmployeesToEmployeesDto(employees);
    }

    public EmployeeDto update(Long id, EmployeeDto newEmployeeDto){
        Employee newEmployee = convertEmployeeDtoToEmployee(newEmployeeDto);
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setFirstName(newEmployee.getFirstName());
                    employee.setLastName(newEmployee.getLastName());
                    employee.setMiddleName(newEmployee.getMiddleName());
                    employee.setDepartment(newEmployee.getDepartment());
                    employeeRepository.save(employee);
                    return convertEmployeeToEmployeeDto(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return convertEmployeeToEmployeeDto(employeeRepository.save(newEmployee));
                });
    }

    private EmployeeDto convertEmployeeToEmployeeDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(),
                employee.getMiddleName(), employee.getDepartment());
        return employeeDto;
    }

    private List<EmployeeDto> convertEmployeesToEmployeesDto(List<Employee> employees){
        List<EmployeeDto> employeeDto = new ArrayList<>();
        employees.forEach(employee -> employeeDto.add(convertEmployeeToEmployeeDto(employee))
//           { EmployeeDto dto = new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(),
//                    employee.getMiddleName(), employee.getDepartment());
//            employeeDto.add(dto); }
        );
        return employeeDto;
    }

    private Employee convertEmployeeDtoToEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setMiddleName(employeeDto.getMiddleName());
        employee.setDepartment(employeeDto.getDepartment());
        return employee;
    }
}
