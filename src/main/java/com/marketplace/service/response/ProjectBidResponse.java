package com.marketplace.service.response;

public class ProjectBidResponse {
	private int projectId;
	private String projectName;
	private String buyerId;
	private String bidAmount;
	private BidStatus status;

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

	public BidStatus getStatus() {
		return status;
	}

	public void setStatus(BidStatus status) {
		this.status = status;
	}

	public enum BidStatus {
		SUCCESS, FAIL
	}
}
