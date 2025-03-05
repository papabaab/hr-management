package com.systalink.hr_management.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    
    private String jobTitle;
    
    @Temporal(TemporalType.DATE)
    private Date hireDate;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @OneToMany(mappedBy = "employee")
    private Set<Contract> contracts;

    @OneToMany(mappedBy = "employee")
    private Set<Absence> absences;

    @OneToMany(mappedBy = "employee")
    private Set<Training> trainings;

    @OneToMany(mappedBy = "employee")
    private Set<Feedback> feedbacks;
}