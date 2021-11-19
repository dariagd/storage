package ru.ddg.storage.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employee_store")
public class EmployeeStore {
    @Embeddable
    public static class Pk implements Serializable{
        @ManyToOne
        @JoinColumn(name = "employee_id")
        private Employee employee;

        @ManyToOne
        @JoinColumn(name = "store_id")
        private Store store;
    }
    @EmbeddedId
    private Pk id;
    @Column(name = "expiration_date")
    private Date expirationDate;

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
