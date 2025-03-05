package com.systalink.hr_management.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String notificationId;
    
    private String message;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date sentDate;
    
    private String recipient;

    @ManyToOne
    @JoinColumn(name = "hr_id")
    private HR hr;
}