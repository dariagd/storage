package ru.ddg.storage.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employee_store")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
