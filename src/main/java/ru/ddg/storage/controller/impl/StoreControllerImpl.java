package ru.ddg.storage.controller.impl;

import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.controller.AbstractController;
import ru.ddg.storage.dto.EmployeeDto;
import ru.ddg.storage.dto.StoreDto;
import ru.ddg.storage.service.impl.EmployeeStoreService;
import ru.ddg.storage.service.impl.StoreServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/store_list")
public class StoreControllerImpl extends AbstractController<StoreDto, Long> {

    private final EmployeeStoreService employeeStoreService;

    StoreControllerImpl(StoreServiceImpl storeService,
                        EmployeeStoreService employeeStoreService) {
        super(storeService);
        this.employeeStoreService = employeeStoreService;
    }

    @GetMapping("/{store_id}/employees")
    public List<EmployeeDto> findAllEmployees(@PathVariable("store_id") Long storeId){
        return employeeStoreService.findAllEmployees(storeId);
    }

    @PostMapping("/{store_id}/employee/{employee_id}")
    public Boolean insertEmployeeIntoStore(@PathVariable("store_id") Long storeId,
                                           @PathVariable("employee_id") Long employeeId){
        return employeeStoreService.connect(employeeId, storeId);
    }
}
