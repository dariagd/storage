package ru.ddg.storage.controller;

import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.dto.EmployeeStoreDto;
import ru.ddg.storage.service.EmployeeStoreService;

import java.util.List;

@RestController
public class EmployeeStoreController {

    private final EmployeeStoreService employeeStoreService;

    EmployeeStoreController(EmployeeStoreService employeeStoreService) {
        this.employeeStoreService = employeeStoreService;
    }

    @GetMapping(value = {"/employee/store", "/store/employee"})
    public List<EmployeeStoreDto> findAll(){
        return employeeStoreService.findAll();
    }

    @PostMapping
    public EmployeeStoreDto insert(@RequestBody EmployeeStoreDto employeeStoreDto){
        return employeeStoreService.insert(employeeStoreDto);
    }

    @DeleteMapping(value = {"/employee/{employeeId}/store/{storeId}", "/store/{storeId}/employee/{employeeId}"})
    public Boolean delete(@PathVariable("employeeId") Long employeeId,
                          @PathVariable("storeId") Long storeId){
        return employeeStoreService.delete(employeeId, storeId);
    }

}
