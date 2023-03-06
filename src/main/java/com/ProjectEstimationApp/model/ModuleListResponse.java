package com.ProjectEstimationApp.model;

import com.ProjectEstimationApp.entity.ModuleList;
import com.ProjectEstimationApp.entity.SubModuleList;

import java.util.List;
import java.util.Map;

public class ModuleListResponse {
	private long ModuleId;
    public String ModuleName;
    public List<SubModuleList> subModuleLists;

    
    public long getModuleId() {
		return ModuleId;
	}

	public void setModuleId(long moduleId) {
		ModuleId = moduleId;
	}

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
