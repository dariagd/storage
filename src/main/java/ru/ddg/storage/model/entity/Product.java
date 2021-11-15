package ru.ddg.storage.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


    @OneToMany(
            mappedBy = "product"
    )
    private List<Good> goods = new ArrayList<>();

    @ManyToMany(
            mappedBy = "parents"
    )
    private List<Product> children = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "composition",
            joinColumns = @JoinColumn(name = "parent_id"),
            inverseJoinColumns = @JoinColumn(name = "child_id")
    )
    private List<Product> parents = new ArrayList<>();
}
