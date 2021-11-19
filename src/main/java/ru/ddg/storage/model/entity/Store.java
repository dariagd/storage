package ru.ddg.storage.model.entity;

import ru.ddg.storage.model.dto.StorageDto;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="store")
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


    public Store() {
    }

    public static Store from(StorageDto storageDto){
        Store store = new Store();
        store.setName(storageDto.getName());
        store.setAddress(storageDto.getAddress());
        return store;
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


    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
