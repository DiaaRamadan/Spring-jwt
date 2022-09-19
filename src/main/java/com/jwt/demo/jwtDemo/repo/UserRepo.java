package com.jwt.demo.jwtDemo.repo;

import com.jwt.demo.jwtDemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.NamedQuery;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
