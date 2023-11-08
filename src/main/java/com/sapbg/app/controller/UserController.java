package com.sapbg.app.controller;

import com.sapbg.app.model.UserEntity;
import com.sapbg.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        // Logic for user login, authenticate user, and handle the login request
        // ...

        return "login-success"; // Redirect to a success page, for example
    }

    @PostMapping("/register")
    public String register(@RequestParam("newUsername") String newUsername, @RequestParam("newPassword") String newPassword) {
        // Logic for user registration, create a new user, and handle the registration request
        UserEntity user = new UserEntity(newUsername, newPassword); // Create a UserEntity object

        userService.createUser(user); // Call the service to register the user

        return "registration-success"; // Redirect to a success page, for example
    }
}
