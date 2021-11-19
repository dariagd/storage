package ru.ddg.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ddg.storage.model.entity.Store;

@Repository
public interface StorehouseRepository extends JpaRepository<Store, Long> {
}
