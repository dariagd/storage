package ru.ddg.storage.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="EMPLOYEES")
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String department;

    @OneToMany(
            mappedBy = "employee"
    )
    private List<EmployeeStorehouse> employeeStorehouses = new ArrayList<EmployeeStorehouse>();

//    @ManyToMany
//    @JoinTable(
//            name="accessed_storehouses",
//            joinColumns = @JoinColumn(name = "employee_id"),
//            inverseJoinColumns = @JoinColumn(name = "storehouse_id")
//    )
//    private List<Storehouse> accessedStorehouses = new ArrayList<>();

    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//    @OneToMany(
//            mappedBy = "primaryKey.employee",
//            cascade = CascadeType.ALL
//    )
//    public List<EmployeeStorehouse> getEmployeeStorehouses() {
//        return employeeStorehouses;
//    }
//
//    public void setEmployeeStorehouses(List<EmployeeStorehouse> employeeStorehouses) {
//        this.employeeStorehouses = employeeStorehouses;
//    }
}
