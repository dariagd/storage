package ru.ddg.storage.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ddg.storage.controller.AbstractController;
import ru.ddg.storage.dto.EmployeeDto;
import ru.ddg.storage.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeControllerImpl extends AbstractController<EmployeeDto, Long> {
    EmployeeControllerImpl(EmployeeServiceImpl employeeService) {
        super(employeeService);
    }
}
