package ru.ddg.storage.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ddg.storage.entity.EmployeeStore;

import java.util.List;

@Repository
public interface EmployeeStoreRepository extends AbstractRepository<EmployeeStore, EmployeeStore.Pk>{
    @Query("SELECT es.id.employeeId FROM EmployeeStore es WHERE es.id.storeId = ?1")
    List<Long> findAllByIdStoreId(Long storeId);
}
