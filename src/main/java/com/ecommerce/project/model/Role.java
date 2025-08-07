package com.ecommerce.project.model;

import jakarta.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleid;

    @Column(length = 20, name = "role_name")
    @Enumerated(EnumType.STRING)
    private AppRole rolename;

    public Role(AppRole rolename) {
        this.rolename = rolename;
    }
}
