package ru.ddg.storage.model.entity;

import ru.ddg.storage.model.dto.StorageDto;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="storehouse")
public class Storehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;

    @OneToMany(
            mappedBy = "storehouse"
    )
    private List<Good> goods = new ArrayList<>();

//    @OneToMany(
//            mappedBy = "primaryKey.storehouse",
//            cascade = CascadeType.ALL
//    )
//    @Column(name = "employee_storehouse")
    @OneToMany(
            mappedBy = "storehouse"
    )
    private List<EmployeeStorehouse> employeeStorehouses = new ArrayList<>();

//    @ManyToMany(
//            mappedBy = "accessedStorehouses"
//    )
//    private List<Employee> employees = new ArrayList<>();


    public Storehouse(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Storehouse() {
    }

    public static Storehouse from(StorageDto storageDto){
        Storehouse storehouse = new Storehouse();
        storehouse.setName(storageDto.getName());
        storehouse.setAddress(storageDto.getAddress());
        return storehouse;
    }

    public void addGood(Good good){
        goods.add(good);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<EmployeeStorehouse> getEmployeeStorehouses() {
        return employeeStorehouses;
    }

    public void setEmployeeStorehouses(List<EmployeeStorehouse> employeeStorehouses) {
        this.employeeStorehouses = employeeStorehouses;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
