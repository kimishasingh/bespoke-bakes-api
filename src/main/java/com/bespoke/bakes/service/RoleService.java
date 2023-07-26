package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.Role;
import com.bespoke.bakes.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public Iterable<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role findRoleById(Long id) {
        Optional<Role> role = roleRepository.findById(id);
        return role.orElse(null);
    }
}
