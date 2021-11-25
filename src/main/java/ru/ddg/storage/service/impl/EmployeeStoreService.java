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
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    private final StoreRepository storeRepository;
    private final EmployeeStoreMapper employeeStoreMapper;
    private final StoreMapper storeMapper;

    public EmployeeStoreService(EmployeeStoreRepository employeeStoreRepository,
                                EmployeeRepository employeeRepository,
                                EmployeeMapper employeeMapper,
                                StoreRepository storeRepository,
                                EmployeeStoreMapper employeeStoreMapper,
                                StoreMapper storeMapper) {
        super(employeeStoreRepository, employeeStoreMapper);
        this.employeeStoreRepository = employeeStoreRepository;
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
        this.storeRepository = storeRepository;
        this.employeeStoreMapper = employeeStoreMapper;
        this.storeMapper = storeMapper;
    }

    public List<StoreDto> findAllStoreList(Long employeeId){
        return employeeStoreRepository.findAllByEmployeeId(employeeId)
                .stream()
                .map(employeeStore -> storeMapper.toDto(storeRepository.findById(employeeStoreMapper.toDto(employeeStore).getStoreId())
                        .orElseThrow(() -> new RuntimeException("Not Found"))))
                .collect(Collectors.toList());
    }

    public List<EmployeeDto> findAllEmployees(Long storeId){
        return employeeStoreRepository.findAllByStoreId(storeId)
                .stream()
                .map(employeeStore -> employeeMapper.toDto(employeeRepository.findById(employeeStoreMapper.toDto(employeeStore).getEmployeeId())
                        .orElseThrow(() -> new RuntimeException("Not Found"))))
                .collect(Collectors.toList());
    }

    public Boolean connect(Long employeeId, Long storeId){
        EmployeeStoreDto employeeStoreDto = new EmployeeStoreDto(employeeId, storeId);
        return true;
    }

    @Override
    public EmployeeStoreDto update(EmployeeStore.Pk pk, EmployeeStoreDto dto) {
        return null;
    }
}
