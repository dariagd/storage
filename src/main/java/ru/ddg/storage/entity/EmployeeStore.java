package ru.ddg.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Delegate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employee__store"
//        uniqueConstraints = { @UniqueConstraint(columnNames = { "employee_id", "store_id"})}
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeStore extends AbstractEntity {
    @EmbeddedId
    private EmployeeStoreId id;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @MapsId("storeId")
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(name = "expiration_date")
    private Date expirationDate;


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

//    private Long employeeId;
//    private Long storeId;
}
