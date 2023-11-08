package com.sapbg.app.model;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Getter
@Entity
@Table(name = "user_roles")
public class UserRole implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String roleName;

    @Override
    public String getAuthority() {
        return roleName;
    }

    public UserRole() {
    }

    public UserRole(String roleName) {
        this.roleName = roleName;
    }
}
