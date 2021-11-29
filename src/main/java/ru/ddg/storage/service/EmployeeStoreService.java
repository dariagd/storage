package ru.ddg.storage.service;

import org.springframework.stereotype.Service;
import ru.ddg.storage.dto.EmployeeStoreDto;
import ru.ddg.storage.entity.EmployeeStore;
import ru.ddg.storage.entity.EmployeeStoreId;
import ru.ddg.storage.mapper.impl.EmployeeStoreMapper;
import ru.ddg.storage.repository.EmployeeStoreRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeStoreService {
    private final EmployeeStoreRepository employeeStoreRepository;
    private final EmployeeStoreMapper employeeStoreMapper;

    EmployeeStoreService(EmployeeStoreRepository employeeStoreRepository,
                         EmployeeStoreMapper employeeStoreMapper) {
        this.employeeStoreRepository = employeeStoreRepository;
        this.employeeStoreMapper = employeeStoreMapper;
    }

    public List<EmployeeStoreDto> findAll(){
        return employeeStoreRepository.findAll()
                .stream()
                .map(employeeStore -> employeeStoreMapper.toDto(employeeStore))
                .collect(Collectors.toList());
    }

    public EmployeeStoreDto insert(EmployeeStoreDto employeeStoreDto){
        EmployeeStoreId employeeStoreId = new EmployeeStoreId(employeeStoreDto.getEmployeeId(), employeeStoreDto.getStoreId());
        return employeeStoreRepository.findById(employeeStoreId)
                .map(employeeStore -> {
                    employeeStore.setExpirationDate(employeeStoreDto.getExpirationDate());
                    return employeeStoreMapper.toDto(employeeStoreRepository.save(employeeStore));
                })
                .orElseGet(() -> employeeStoreMapper.toDto(employeeStoreRepository.save(employeeStoreMapper.toEntity(employeeStoreDto))));
    }

    public Boolean delete(Long employeeId, Long storeId){
        EmployeeStoreId employeeStoreId = new EmployeeStoreId(employeeId, storeId);
        employeeStoreRepository.deleteById(employeeStoreId);
        return true;
    }

}
