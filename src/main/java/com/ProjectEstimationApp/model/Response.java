package com.ProjectEstimationApp.model;

import com.ProjectEstimationApp.entity.SubModuleList;

import java.util.List;

public class Response {
	private long ModuleId;
    private String ModuleName;
    private List<SubModuleList> subModules;

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

    public List<SubModuleList> getSubModules() {
        return subModules;
    }

    public void setSubModules(List<SubModuleList> subModules) {
        this.subModules = subModules;
    }

    @Override
    public String toString() {
        return "Response{" +
                "ModuleId=" + ModuleId +
                ", ModuleName='" + ModuleName + '\'' +
                ", subModules=" + subModules +
                '}';
    }
}
