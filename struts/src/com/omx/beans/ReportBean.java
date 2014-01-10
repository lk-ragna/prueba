package com.omx.beans;

public class ReportBean {
	private String sku;
	private String description;
	private Integer quantity;
	private Double price;
	private Double total;
	private Integer membrerId;
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReportBean [sku=");
		builder.append(sku);
		builder.append(", description=");
		builder.append(description);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", price=");
		builder.append(price);
		builder.append(", total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}
	public Integer getMembrerId() {
		return membrerId;
	}
	public void setMembrerId(Integer membrerId) {
		this.membrerId = membrerId;
	}
	
	

}
