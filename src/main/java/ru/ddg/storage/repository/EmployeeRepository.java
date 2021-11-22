package ru.ddg.storage.repository;

import org.springframework.stereotype.Repository;
import ru.ddg.storage.entity.Employee;

@Repository
public interface EmployeeRepository extends AbstractRepository<Employee, Long> {
}
