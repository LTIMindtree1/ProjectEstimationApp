package com.ProjectEstimationApp.model;

import java.util.List;

public class Response {
    private String ModuleName;
    private List<String> subModules;

    public String getModuleName() {
        return ModuleName;
    }

    public void setModuleName(String moduleName) {
        ModuleName = moduleName;
    }

    public List<String> getSubModules() {
        return subModules;
    }

    public void setSubModules(List<String> subModules) {
        this.subModules = subModules;
    }

    @Override
    public String toString() {
        return "Response{" +
                "ModuleName='" + ModuleName + '\'' +
                ", subModules=" + subModules +
                '}';
    }
}
