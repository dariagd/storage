package ru.ddg.storage.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ddg.storage.entity.ProductComposition;

import java.util.List;

@Repository
public interface ProductCompositionRepository extends AbstractRepository<ProductComposition, Long>{
//    @Query("SELECT pc.id.childId, pc.amount FROM ProductComposition pc WHERE pc.id.parentId = ?1")
//    List<ProductComposition> findAllByIdParentId(Long parentId);
//
//    @Query("SELECT pc.id.parentId, pc.amount FROM ProductComposition pc WHERE pc.id.childId = ?1")
//    List<ProductComposition> findAllByIdChildId(Long childId);
}
