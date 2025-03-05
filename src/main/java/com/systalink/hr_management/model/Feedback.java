package com.systalink.hr_management.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "feedbacks")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String feedbackId;
    
    private String employeeId;
    private String content;
    
    @Temporal(TemporalType.DATE)
    private Date submissionDate;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}