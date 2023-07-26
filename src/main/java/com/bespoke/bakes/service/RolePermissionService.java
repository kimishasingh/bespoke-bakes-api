package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.RolePermission;
import com.bespoke.bakes.repository.RolePermissionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolePermissionService {

    private final RolePermissionRepository rolePermissionRepository;

    public RolePermissionService(RolePermissionRepository rolePermissionRepository) {
        this.rolePermissionRepository = rolePermissionRepository;
    }

    public RolePermission createRolePermission(RolePermission rolePermission) {
        return rolePermissionRepository.save(rolePermission);
    }

    public Iterable<RolePermission> getAllRolePermissions() {
        return rolePermissionRepository.findAll();
    }

    public RolePermission findRolePermissionById(Long id) {
        Optional<RolePermission> rolePermission = rolePermissionRepository.findById(id);
        return rolePermission.orElse(null);
    }
}
