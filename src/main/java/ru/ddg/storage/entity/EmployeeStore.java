package ru.ddg.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee_store")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeStore extends AbstractEntity {
    @Embeddable
    @Getter
    @Setter
    public static class Pk implements Serializable{
        private Long employeeId;
        private Long storeId;
    }
    @EmbeddedId
    private Pk id;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @MapsId("storeId")
    @JoinColumn(name = "store_id")
    private Store store;
}
