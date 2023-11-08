package com.sapbg.app.repository;

import com.sapbg.app.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByRoleName(String roleName);
    // You can add custom query methods if needed
}
