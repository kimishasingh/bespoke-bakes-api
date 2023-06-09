package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.RolePermission;
import com.bespoke.bakes.service.RolePermissionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role-permission")
public class RolePermissionController {

    private final RolePermissionService rolePermissionService;

    public RolePermissionController(RolePermissionService rolePermissionService) {
        this.rolePermissionService = rolePermissionService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RolePermission createRolePermission(@RequestBody RolePermission rolePermission) {
        return rolePermissionService.createRolePermission(rolePermission);
    }

    @GetMapping
    public Iterable<RolePermission> getRolePermissions() {
        return rolePermissionService.getAllRolePermissions();
    }
}
