package ru.ddg.storage.service.impl;

import org.springframework.stereotype.Service;
import ru.ddg.storage.dto.EmployeeDto;
import ru.ddg.storage.dto.EmployeeStoreDto;
import ru.ddg.storage.dto.StoreDto;
import ru.ddg.storage.entity.EmployeeStore;
import ru.ddg.storage.mapper.impl.EmployeeStoreMapper;
import ru.ddg.storage.repository.EmployeeStoreRepository;
import ru.ddg.storage.service.AbstractCrudService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeStoreService{

    private final EmployeeStoreRepository employeeStoreRepository;
    private final EmployeeStoreMapper employeeStoreMapper;
    private final EmployeeServiceImpl employeeService;
    private final StoreServiceImpl storeService;

    public EmployeeStoreService(EmployeeStoreRepository employeeStoreRepository,
                                EmployeeStoreMapper employeeStoreMapper,
                                EmployeeServiceImpl employeeService,
                                StoreServiceImpl storeService) {
        this.employeeStoreRepository = employeeStoreRepository;
        this.employeeStoreMapper = employeeStoreMapper;
        this.employeeService = employeeService;
        this.storeService = storeService;
    }

    public List<EmployeeDto> findAllEmployees(Long storeId){
        return employeeStoreRepository.findAllByIdStoreId(storeId)
                .stream()
                .map(employeeId -> employeeService.findById(employeeId))
                .collect(Collectors.toList());
    }

    public List<StoreDto> findAllStoreList(Long employeeId){
        return employeeStoreRepository.findAllByIdEmployeeId(employeeId)
                .stream()
                .map(storeId -> storeService.findById(storeId))
                .collect(Collectors.toList());
    }

    public Boolean connect(Long employeeId, Long storeId){
        EmployeeStoreDto employeeStoreDto = new EmployeeStoreDto(employeeId, storeId);
        employeeStoreRepository.save(employeeStoreMapper.toEntity(employeeStoreDto));
        return true;
    }
}
