package ru.ddg.storage.controller.impl;

import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.controller.AbstractController;
import ru.ddg.storage.dto.EmployeeDto;
import ru.ddg.storage.dto.StoreDto;
import ru.ddg.storage.service.impl.EmployeeServiceImpl;
import ru.ddg.storage.service.impl.EmployeeStoreService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeControllerImpl extends AbstractController<EmployeeDto, Long> {

    private final EmployeeStoreService employeeStoreService;

    EmployeeControllerImpl(EmployeeServiceImpl employeeService,
                           EmployeeStoreService employeeStoreService) {
        super(employeeService);
        this.employeeStoreService = employeeStoreService;
    }

    @GetMapping("/{employee_id}/store_list/")
    public List<StoreDto> findAllStoreList(@PathVariable("employee_id") Long employeeId){
        return employeeStoreService.findAllStoreList(employeeId);
    }

    @PostMapping("/{employee_id}/store_list/{store_id}")
    public Boolean insertStoreInEmployee(@PathVariable("employee_id") Long employeeId,
                                         @PathVariable("store_id") Long storeId){
        return employeeStoreService.connect(employeeId, storeId);
    }
}
