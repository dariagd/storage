package ru.ddg.storage.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ddg.storage.entity.EmployeeStore;

import java.util.List;

@Repository
public interface EmployeeStoreRepository extends AbstractRepository<EmployeeStore, EmployeeStore.Pk>{
    @Query(value = "select employee_id from employee_store where store_id LIKE :storeId", nativeQuery = true)
    List<EmployeeStore> findAllByStoreId(Long storeId);

    @Query(value = "select store_id from employee_store where employee_id LIKE :employeeId", nativeQuery = true)
    List<EmployeeStore> findAllByEmployeeId(Long employeeId);
}
