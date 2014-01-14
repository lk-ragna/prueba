package com.omx.beans;

import java.util.Date;
import java.util.List;

public class BudgetBean {

	private Integer idBudget;
	private List<BudgetAvailableBean> budgetAvailable;
	private Long member_id;
	private Double creditAmount;
	private Date creationDate;
	private int lengthPeriod;
	private int status;
	public Integer getIdBudget() {
		return idBudget;
	}
	public void setIdBudget(Integer idBudget) {
		this.idBudget = idBudget;
	}
	public List<BudgetAvailableBean> getBudgetAvailable() {
		return budgetAvailable;
	}
	public void setBudgetAvailable(List<BudgetAvailableBean> budgetAvailable) {
		this.budgetAvailable = budgetAvailable;
	}
	public Long getMember_id() {
		return member_id;
	}
	public void setMember_id(Long member_id) {
		this.member_id = member_id;
	}
	public Double getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getLengthPeriod() {
		return lengthPeriod;
	}
	public void setLengthPeriod(int lengthPeriod) {
		this.lengthPeriod = lengthPeriod;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BudgetBean [idBudget=");
		builder.append(idBudget);
		builder.append(", budgetAvailable=");
		builder.append(budgetAvailable);
		builder.append(", member_id=");
		builder.append(member_id);
		builder.append(", creditAmount=");
		builder.append(creditAmount);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", lengthPeriod=");
		builder.append(lengthPeriod);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
