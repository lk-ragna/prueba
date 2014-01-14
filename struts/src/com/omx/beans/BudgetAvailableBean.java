package com.omx.beans;

public class BudgetAvailableBean {
	
	 private Long member_id;
	 private double budgetAvailable;
	 private double budgetUsed;
	public Long getMember_id() {
		return member_id;
	}
	public void setMember_id(Long member_id) {
		this.member_id = member_id;
	}
	public double getBudgetAvailable() {
		return budgetAvailable;
	}
	public void setBudgetAvailable(double budgetAvailable) {
		this.budgetAvailable = budgetAvailable;
	}
	public double getBudgetUsed() {
		return budgetUsed;
	}
	public void setBudgetUsed(double budgetUsed) {
		this.budgetUsed = budgetUsed;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BudgetAvailableBean [member_id=");
		builder.append(member_id);
		builder.append(", budgetAvailable=");
		builder.append(budgetAvailable);
		builder.append(", budgetUsed=");
		builder.append(budgetUsed);
		builder.append("]");
		return builder.toString();
	}
	 
	 

}
