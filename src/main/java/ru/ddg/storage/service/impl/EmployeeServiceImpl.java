package ru.ddg.storage.service.impl;

import org.springframework.stereotype.Service;
import ru.ddg.storage.mapper.impl.EmployeeMapper;
import ru.ddg.storage.dto.EmployeeDto;
import ru.ddg.storage.entity.Employee;
import ru.ddg.storage.repository.EmployeeRepository;
import ru.ddg.storage.service.AbstractCrudService;


@Service
public class EmployeeServiceImpl extends AbstractCrudService<Employee, EmployeeDto, Long> {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    protected EmployeeServiceImpl(
            EmployeeRepository employeeRepository,
            EmployeeMapper employeeMapper
    ) {
        super(employeeRepository, employeeMapper);
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public EmployeeDto update(Long id, EmployeeDto newEmployeeDto) {
        return employeeRepository.findById(id)
                                .map(employee -> {
                                    employee.setFirstName(newEmployeeDto.getFirstName());
                                    employee.setLastName(newEmployeeDto.getLastName());
                                    employee.setMiddleName(newEmployeeDto.getMiddleName());
                                    employee.setDepartment(newEmployeeDto.getDepartment());
                                    return employeeMapper.toDto(employeeRepository.save(employee));
                                })
                                .orElseGet(() -> {
                                    newEmployeeDto.setId(id);
                                    return employeeMapper.toDto(employeeRepository.save(employeeMapper.toEntity(newEmployeeDto)));
                                });
    }

    //    @Override
//    public EmployeeDto getById(Long id) {
//        Optional<Employee> employeeOptional = employeeRepository.findById(id);
//        return convertEmployeeToEmployeeDto(employeeOptional.orElse(null));
//    }
//
//    // атрибут должен передаваться, но не изменяться
//    @Override
//    public EmployeeDto save(EmployeeDto employeeDto) {
//        Employee employee = employeeRepository.save(convertEmployeeDtoToEmployee(employeeDto));
//        return convertEmployeeToEmployeeDto(employee);
//    }
//
//    @Override
//    public void delete(Long id) {
//        employeeRepository.deleteById(id);
//    }
//
//    @Override
//    public List<EmployeeDto> getAll() {
//        List<Employee> employees = employeeRepository.findAll();
//        return convertEmployeesToEmployeesDto(employees);
//    }
//
//    public EmployeeDto update(Long id, EmployeeDto newEmployeeDto){
//        Employee newEmployee = convertEmployeeDtoToEmployee(newEmployeeDto);
//        return employeeRepository.findById(id)
//                .map(employee -> {
//                    employee.setFirstName(newEmployee.getFirstName());
//                    employee.setLastName(newEmployee.getLastName());
//                    employee.setMiddleName(newEmployee.getMiddleName());
//                    employee.setDepartment(newEmployee.getDepartment());
//                    employeeRepository.save(employee);
//                    return convertEmployeeToEmployeeDto(employee);
//                })
//                .orElseGet(() -> {
//                    newEmployee.setId(id);
//                    return convertEmployeeToEmployeeDto(employeeRepository.save(newEmployee));
//                });
//    }
//
//    private EmployeeDto convertEmployeeToEmployeeDto(Employee employee){
//        EmployeeDto employeeDto = new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(),
//                employee.getMiddleName(), employee.getDepartment());
//        return employeeDto;
//    }
//
//    private List<EmployeeDto> convertEmployeesToEmployeesDto(List<Employee> employees){
//        List<EmployeeDto> employeeDto = new ArrayList<>();
//        employees.forEach(employee -> employeeDto.add(convertEmployeeToEmployeeDto(employee))
////           { EmployeeDto dto = new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(),
////                    employee.getMiddleName(), employee.getDepartment());
////            employeeDto.add(dto); }
//        );
//        return employeeDto;
//    }
//
//    private Employee convertEmployeeDtoToEmployee(EmployeeDto employeeDto){
//        Employee employee = new Employee();
//        employee.setFirstName(employeeDto.getFirstName());
//        employee.setLastName(employeeDto.getLastName());
//        employee.setMiddleName(employeeDto.getMiddleName());
//        employee.setDepartment(employeeDto.getDepartment());
//        return employee;
//    }


}
