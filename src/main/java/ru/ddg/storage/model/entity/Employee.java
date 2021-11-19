package ru.ddg.storage.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "department")
    private String department;
    @OneToMany(
            mappedBy = "id.employee"
    )
    private List<EmployeeStore> employeeStoreList = new ArrayList<EmployeeStore>();

//    @ManyToMany
//    @JoinTable(
//            name="accessed_storehouses",
//            joinColumns = @JoinColumn(name = "employee_id"),
//            inverseJoinColumns = @JoinColumn(name = "storehouse_id")
//    )
//    private List<Storehouse> accessedStorehouses = new ArrayList<>();
}
