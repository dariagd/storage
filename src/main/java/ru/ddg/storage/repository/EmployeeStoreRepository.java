package ru.ddg.storage.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ddg.storage.entity.EmployeeStore;
import ru.ddg.storage.entity.EmployeeStoreId;

import java.util.List;

@Repository
public interface EmployeeStoreRepository extends AbstractRepository<EmployeeStore, EmployeeStoreId>{
//    @Query("SELECT es.id.employeeId FROM EmployeeStore es WHERE es.id.storeId = ?1")
//    List<Long> findAllByIdStoreId(Long storeId);
//
//    @Query("SELECT es.id.storeId FROM EmployeeStore es WHERE es.id.employeeId = ?1")
//    List<Long> findAllByIdEmployeeId(Long employeeId);

//    @Query("SELECT es.id.employeeId, es.id.storeId FROM EmployeeStore es WHERE ")
//    List<Long> findRowByEmployeeIdAndStoreId(Long employeeId, Long storeId)
}
