package com.sapbg.app.controller;

import lombok.Getter;

@Getter
public class JwtRequest {
    // Getters and setters
    private String username;
    private String password;

    // Constructors
    public JwtRequest() {
    }

    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
