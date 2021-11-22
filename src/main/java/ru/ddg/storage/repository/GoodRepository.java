package ru.ddg.storage.repository;

import org.springframework.stereotype.Repository;
import ru.ddg.storage.entity.Good;

@Repository
public interface GoodRepository extends AbstractRepository<Good, Long> {
}
