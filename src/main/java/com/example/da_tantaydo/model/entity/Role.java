package com.example.da_tantaydo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "DIM_ROLES")
public class Role {

    @Id
    @Column(name="ID")
    private Long id;

    @Column(name="ROLE_CODE")
    private Integer roleCode;

    @Column(name = "ROLE_NAME")
    private String roleName;
}