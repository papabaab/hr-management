package com.systalink.hr_management.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "hr")
public class HR {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    
    private String name;
    private String email;

    @OneToMany(mappedBy = "hr")
    private Set<Notification> notifications;

    @OneToMany(mappedBy = "hr")
    private Set<GEDSystem> gedSystems;
}