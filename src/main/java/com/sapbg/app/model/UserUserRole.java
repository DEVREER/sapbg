package com.sapbg.app.model;

import com.sapbg.app.model.UserRole;

import javax.persistence.*;

@Entity
@Table(name = "user_user_role")
public class UserUserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "user_role_id")
    private UserRole userRole;

    // Constructors, getters, and setters
}
