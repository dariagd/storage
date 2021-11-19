package ru.ddg.storage.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="store")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "store_id")
    private Long id;
    @Column(name = "store_name")
    private String name;
    @Column(name = "address")
    private String address;
    @OneToMany(
            mappedBy = "id.store"
    )
    private List<Good> goods = new ArrayList<>();
    @OneToMany(
            mappedBy = "id.store"
    )
    private List<EmployeeStore> employeeStores = new ArrayList<>();
}
