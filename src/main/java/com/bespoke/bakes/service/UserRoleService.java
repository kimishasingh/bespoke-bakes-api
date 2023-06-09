package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.UserRole;
import com.bespoke.bakes.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService {

    private UserRoleRepository userRoleRepository;

    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public UserRole createUserRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    public Iterable<UserRole> getAllUserRoles() {
        return userRoleRepository.findAll();
    }
}
