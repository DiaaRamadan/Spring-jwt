package com.jwt.demo.jwtDemo.repo;

import com.jwt.demo.jwtDemo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
