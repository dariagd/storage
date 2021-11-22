package ru.ddg.storage.entity;

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
public class EmployeeStore extends AbstractEntity {
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
