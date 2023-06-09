package com.bespoke.bakes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "Role_Permission_Tbl")
public class RolePermission implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;
    @Column(name = "RoleId")
    private Long roleId;
    @Column(name = "PermissionId")
    private Long permissionId;
    @Column(name = "IsActive")
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
