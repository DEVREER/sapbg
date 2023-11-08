package com.sapbg.app.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action"); // Add a hidden field named "action" in your HTML form

        if ("login".equals(action)) {
            // Handle login
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // Replace this with your own authentication logic
            if ("your_username".equals(username) && "your_password".equals(password)) {
                response.getWriter().write("Login successful!");
            } else {
                response.getWriter().write("Login failed. Please try again.");
            }
        } else if ("register".equals(action)) {
            // Handle registration
            String newUsername = request.getParameter("newUsername");
            String newPassword = request.getParameter("newPassword");

            // Replace this with your own registration logic
            // You can save the new user in your database
            // For simplicity, we'll just print the registered user's information
            response.getWriter().write("Registered new user:\nUsername: " + newUsername + "\nPassword: " + newPassword);
        }
    }
}
