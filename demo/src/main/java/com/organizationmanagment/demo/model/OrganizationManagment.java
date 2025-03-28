package com.organizationmanagment.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class OrganizationManagment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private OrganizationType type;

    private Long parentOrganizationId;

    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters
}

