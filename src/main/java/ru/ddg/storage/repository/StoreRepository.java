package ru.ddg.storage.repository;

import org.springframework.stereotype.Repository;
import ru.ddg.storage.entity.Store;

@Repository
public interface StoreRepository extends AbstractRepository<Store, Long> {
}
