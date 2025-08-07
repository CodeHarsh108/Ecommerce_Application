package com.ecommerce.project.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "roles")
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
