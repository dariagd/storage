package ru.ddg.storage.service.impl;

import org.springframework.stereotype.Service;
import ru.ddg.storage.dto.EmployeeDto;
import ru.ddg.storage.dto.EmployeeStoreDto;
import ru.ddg.storage.dto.StoreDto;
import ru.ddg.storage.entity.EmployeeStore;
import ru.ddg.storage.mapper.impl.EmployeeMapper;
import ru.ddg.storage.mapper.impl.EmployeeStoreMapper;
import ru.ddg.storage.mapper.impl.StoreMapper;
import ru.ddg.storage.repository.EmployeeRepository;
import ru.ddg.storage.repository.EmployeeStoreRepository;
import ru.ddg.storage.repository.StoreRepository;
import ru.ddg.storage.service.AbstractCrudService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeStoreService extends AbstractCrudService<EmployeeStore, EmployeeStoreDto, EmployeeStore.Pk> {

    private final EmployeeStoreRepository employeeStoreRepository;
    private final EmployeeStoreMapper employeeStoreMapper;
    private final EmployeeServiceImpl employeeService;

    public EmployeeStoreService(EmployeeStoreRepository employeeStoreRepository,
                                EmployeeStoreMapper employeeStoreMapper,
                                EmployeeServiceImpl employeeService) {
        super(employeeStoreRepository, employeeStoreMapper);
        this.employeeStoreRepository = employeeStoreRepository;
        this.employeeStoreMapper = employeeStoreMapper;
        this.employeeService = employeeService;
    }

    public List<EmployeeDto> findAllEmployees(Long storeId){
        return employeeStoreRepository.findAllByIdStoreId(storeId)
                .stream()
                .map(employeeStore -> employeeService.findById(employeeStore))
                .collect(Collectors.toList());
    }

    public Boolean connect(Long employeeId, Long storeId){
        EmployeeStoreDto employeeStoreDto = new EmployeeStoreDto(employeeId, storeId);
        employeeStoreRepository.save(employeeStoreMapper.toEntity(employeeStoreDto));
        return true;
    }

    @Override
    public EmployeeStoreDto update(EmployeeStore.Pk pk, EmployeeStoreDto dto) {
        return null;
    }
}
