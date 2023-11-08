package com.sapbg.app.service;

import com.sapbg.app.model.User;
import com.sapbg.app.model.UserRole;
import com.sapbg.app.repository.UserRepository;
import com.sapbg.app.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public AuthService(UserRepository userRepository, UserRoleRepository userRoleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public com.sapbg.app.model.User registerUser(com.sapbg.app.model.User user, Set<String> roleNames) {
        Set<UserRole> roles = new HashSet<>();

        for (String roleName : roleNames) {
            UserRole userRole = userRoleRepository.findByRoleName(roleName);
            if (userRole != null) {
                roles.add(userRole);
            }
        }

        user.setRoles(roles);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    // Add more methods as needed
}
