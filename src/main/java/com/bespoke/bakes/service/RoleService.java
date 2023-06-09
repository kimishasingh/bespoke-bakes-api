package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.Role;
import com.bespoke.bakes.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public Iterable<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
