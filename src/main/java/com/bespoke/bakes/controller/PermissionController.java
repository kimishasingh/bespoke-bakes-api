package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.Permission;
import com.bespoke.bakes.service.PermissionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/permission")
public class PermissionController {

    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Permission createBundle(@RequestBody Permission permission) {
        return permissionService.createPermission(permission);
    }

    @GetMapping
    public Iterable<Permission> getPermissions() {
        return permissionService.getAllPermissions();
    }

    @GetMapping("/{id}")
    public Permission getPermissionById(@PathVariable("id") Long id) {
        return permissionService.findPermissionById(id);
    }
}
