package ru.ddg.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "product_name")
    private String name;
    @OneToMany(
            mappedBy = "product"
    )
    private List<Good> goods = new ArrayList<>();
    @OneToMany(
            mappedBy = "id.parent"
    )
    private List<ProductComposition> parents;
    @OneToMany(
            mappedBy = "id.child"
    )
    private List<ProductComposition> children;
}
