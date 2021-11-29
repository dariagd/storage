package ru.ddg.storage.entity;

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
public class Store extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long id;
    @Column(name = "store_name")
    private String name;
    @Column(name = "address")
    private String address;
//    @OneToMany(
//            mappedBy = "id.store"
//    )
//    private List<Good> goods = new ArrayList<>();
    @OneToMany(
            mappedBy = "store"
    )
    private List<Good> goods;
    @OneToMany(
            mappedBy = "store"
    )
    private List<EmployeeStore> employeeStoreList = new ArrayList<>();
}
