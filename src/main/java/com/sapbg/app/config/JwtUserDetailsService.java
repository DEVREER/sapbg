package com.sapbg.app.config;

import com.sapbg.app.repository.UserRepository;
import com.sapbg.app.model.User; // Import your custom User class
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public JwtUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> loadUserByUsername(Long id) throws UsernameNotFoundException {
        // Load the user by their Id from the repository

        // Return your custom User class, which should implement UserDetails
        return userRepository.findById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
