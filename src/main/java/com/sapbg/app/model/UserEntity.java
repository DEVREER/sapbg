package com.sapbg.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    private Long id;
    // Example getter and setter methods for username and password:
    @Getter
    private String username;
    @Getter
    private String password;

    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Constructors, getters, setters, and other fields as needed

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
