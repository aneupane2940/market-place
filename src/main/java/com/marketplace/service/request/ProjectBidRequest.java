package com.marketplace.service.request;

public class ProjectBidRequest {
	private int projectId;
	private String projectName;
	private String buyerId;
	private String bidAmount;

	public int getId() {
		return projectId;
	}

	public void setId(int id) {
		this.projectId = id;
	}

	public String getName() {
		return projectName;
	}

	public void setName(String name) {
		this.projectName = name;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(String bidAmount) {
		this.bidAmount = bidAmount;
	}
}
