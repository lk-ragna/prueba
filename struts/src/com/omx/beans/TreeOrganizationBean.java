package com.omx.beans;

import java.util.List;

public class TreeOrganizationBean {
	
	private String organizationName;
	private Long organizationId;
	private String type;
	private Integer budget;
	private List<TreeOrganizationBean> treeOrganizationBean;
	
	
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public Long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}
	public List<TreeOrganizationBean> getTreeOrganizationBean() {
		return treeOrganizationBean;
	}
	public void setTreeOrganizationBean(
			List<TreeOrganizationBean> treeOrganizationBean) {
		this.treeOrganizationBean = treeOrganizationBean;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TreeOrganizationBean [organizationName=");
		builder.append(organizationName);
		builder.append(", organizationId=");
		builder.append(organizationId);
		builder.append(", type=");
		builder.append(type);
		builder.append(", budget=");
		builder.append(budget);
		builder.append(", treeOrganizationBean=");
		builder.append(treeOrganizationBean);
		builder.append("]");
		return builder.toString();
	}
	
	

}
