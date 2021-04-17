package com.role.access.model;

import java.util.List;

public class Resources {
    public String resourceName;
    public List<String> actionType;

    public Resources() {
    }

    public Resources(String resourceName, List<String> actionType) {
        this.resourceName = resourceName;
        this.actionType = actionType;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public List<String> getActionType() {
        return actionType;
    }

    public void setActionType(List<String> actionType) {
        this.actionType = actionType;
    }
}
