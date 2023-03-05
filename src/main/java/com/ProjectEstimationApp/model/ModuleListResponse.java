package com.ProjectEstimationApp.model;

import com.ProjectEstimationApp.entity.ModuleList;
import com.ProjectEstimationApp.entity.SubModuleList;

import java.util.List;
import java.util.Map;

public class ModuleListResponse {
    public String ModuleName;
    public List<SubModuleList> subModuleLists;

    public String getModuleName() {
        return ModuleName;
    }

    public void setModuleName(String moduleName) {
        ModuleName = moduleName;
    }

    public List<SubModuleList> getSubModuleLists() {
        return subModuleLists;
    }

    public void setSubModuleLists(List<SubModuleList> subModuleLists) {
        this.subModuleLists = subModuleLists;
    }

    @Override
    public String toString() {
        return "ModuleListResponse{" +
                "ModuleName='" + ModuleName + '\'' +
                ", subModuleLists=" + subModuleLists +
                '}';
    }
}
