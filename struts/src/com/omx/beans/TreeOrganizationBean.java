package com.omx.beans;

import java.util.List;

public class TreeOrganizationBean {
	
	private String organizationName; //logonID or Orgentity name
	private Long organizationId;
	private String type;
	private List<TreeOrganizationBean> treeOrganizationBean;
	private List<BudgetBean> budget;
	private List<BudgetAvailableBean> avalibleBudget;
	
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
	public List<BudgetBean> getBudget() {
		return budget;
	}
	public void setBudget(List<BudgetBean> budget) {
		this.budget = budget;
	}
	
	public List<BudgetAvailableBean> getAvalibleBudget() {
		return avalibleBudget;
	}
	public void setAvalibleBudget(List<BudgetAvailableBean> avalibleBudget) {
		this.avalibleBudget = avalibleBudget;
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
		builder.append(", treeOrganizationBean=");
		builder.append(treeOrganizationBean);
		builder.append(", budget=");
		builder.append(budget);
		builder.append(", avalibleBudget=");
		builder.append(avalibleBudget);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
