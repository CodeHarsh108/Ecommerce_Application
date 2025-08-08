package com.ecommerce.project.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    @Getter
    @Setter
    private Integer roleid;

    @Column(length = 20, name = "role_name")
    @Enumerated(EnumType.STRING)
    @ToString.Exclude
    private AppRole rolename;

    public Role(AppRole rolename) {
        this.rolename = rolename;
    }
}
