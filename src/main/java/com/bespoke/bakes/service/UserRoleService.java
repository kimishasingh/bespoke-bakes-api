package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.UserRole;
import com.bespoke.bakes.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRoleService {

    private final UserRoleRepository userRoleRepository;

    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public UserRole createUserRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    public Iterable<UserRole> getAllUserRoles() {
        return userRoleRepository.findAll();
    }

    public UserRole findUserRoleById(Long id) {
        Optional<UserRole> userRole = userRoleRepository.findById(id);
        return userRole.orElse(null);
    }
}
