package ru.ddg.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ddg.storage.model.entity.Good;

@Repository
public interface GoodRepository extends JpaRepository<Good, Good.Pk> {
}
