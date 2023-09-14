package com.bespoke.bakes.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "role_permission_tbl")
public class RolePermission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "role_id")
    private Long roleId;
    @Column(name = "permission_id")
    private Long permissionId;
    @Column(name = "is_active")
    private boolean isActive;

    public RolePermission() {
    }

    public RolePermission(Long roleId, Long permissionId, boolean isActive) {
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
