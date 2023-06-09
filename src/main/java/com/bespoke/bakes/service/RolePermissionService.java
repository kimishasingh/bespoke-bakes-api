package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.RolePermission;
import com.bespoke.bakes.repository.RolePermissionRepository;
import org.springframework.stereotype.Service;

@Service
public class RolePermissionService {

    private RolePermissionRepository rolePermissionRepository;

    public RolePermissionService(RolePermissionRepository rolePermissionRepository) {
        this.rolePermissionRepository = rolePermissionRepository;
    }

    public RolePermission createRolePermission(RolePermission rolePermission) {
        return rolePermissionRepository.save(rolePermission);
    }

    public Iterable<RolePermission> getAllRolePermissions() {
        return rolePermissionRepository.findAll();
    }
}
