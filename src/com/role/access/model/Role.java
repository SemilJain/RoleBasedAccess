package com.role.access.model;

import java.util.List;

public class Role {

    public String roleName;

    public List<Resources> resources;

    public Role() {
    }

    public Role(String roleName, List<Resources> resources) {
        this.roleName = roleName;
        this.resources = resources;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Resources> getResources() {
        return resources;
    }

    public void setResources(List<Resources> resources) {
        this.resources = resources;
    }
}
