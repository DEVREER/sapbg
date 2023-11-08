package com.sapbg.app.service;

import com.sapbg.app.model.UserRole;
import com.sapbg.app.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService {

    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public UserRole createRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    // Add more methods as needed
}
