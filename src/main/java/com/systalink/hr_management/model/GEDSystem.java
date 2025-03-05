package com.systalink.hr_management.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "ged_systems")
public class GEDSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String documentId;
    
    private String documentType;
    private String filePath;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDate;

    @ManyToOne
    @JoinColumn(name = "hr_id")
    private HR hr;
}