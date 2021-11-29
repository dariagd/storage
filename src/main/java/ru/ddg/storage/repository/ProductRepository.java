package ru.ddg.storage.repository;

import org.springframework.stereotype.Repository;
import ru.ddg.storage.entity.Product;

@Repository
public interface ProductRepository extends AbstractRepository<Product, Long>{
}
