package com.sapbg.app.dto;

import com.sapbg.app.model.User;

public class UserDto {
    private String username;
    private String password;

    // Constructors
    public UserDto() {
    }

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User toUser() {
        return null;
    }
}
