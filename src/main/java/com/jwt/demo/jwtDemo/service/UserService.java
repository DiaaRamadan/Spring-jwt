package com.jwt.demo.jwtDemo.service;

import com.jwt.demo.jwtDemo.domain.Role;
import com.jwt.demo.jwtDemo.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
