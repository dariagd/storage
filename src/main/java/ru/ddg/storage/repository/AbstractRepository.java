package ru.ddg.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.ddg.storage.entity.AbstractEntity;

@NoRepositoryBean
public interface AbstractRepository<E, ID> extends JpaRepository<E, ID> {
}
