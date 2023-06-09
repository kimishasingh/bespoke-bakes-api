package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.Permission;
import com.bespoke.bakes.repository.PermissionRepository;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {

    private PermissionRepository permissionRepository;

    public PermissionService(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    public Permission createPermission(Permission permission) {
        return permissionRepository.save(permission);
    }

    public Iterable<Permission> getAllPermissions() {
        return permissionRepository.findAll();
    }
}
