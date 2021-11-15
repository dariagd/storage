package ru.ddg.storage.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class EmployeeStorehouse {

    @Embeddable
    public static class Pk implements Serializable{
        @Column(name = "employee_id")
        private Long employeeId;

        @Column(name = "storehouse_id")
        private Long storehouseId;
    }

    @EmbeddedId
    private Pk id;

    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "storehouse_id", insertable = false, updatable = false)
    private Storehouse storehouse;

    private Date expirationDate;

//    //composite-id key
//    private EmployeeStorehousePk primaryKey = new EmployeeStorehousePk();
//
//    private Date expirationDate;
//
//    @EmbeddedId
//    public EmployeeStorehousePk getPrimaryKey() {
//        return primaryKey;
//    }


    public Pk getId() {
        return id;
    }

    public void setId(Pk id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
