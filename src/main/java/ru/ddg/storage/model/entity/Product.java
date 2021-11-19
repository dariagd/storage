package ru.ddg.storage.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="product")
public class Product {
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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
