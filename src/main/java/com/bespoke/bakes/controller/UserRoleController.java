package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.UserRole;
import com.bespoke.bakes.service.UserRoleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-role")
public class UserRoleController {

    private final UserRoleService userRoleService;

    public UserRoleController(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserRole createUserRole(@RequestBody UserRole userRole) {
        return userRoleService.createUserRole(userRole);
    }

    @GetMapping
    public Iterable<UserRole> getUserRoles() {
        return userRoleService.getAllUserRoles();
    }
}
