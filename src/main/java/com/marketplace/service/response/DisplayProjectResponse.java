package com.marketplace.service.response;

import com.marketplace.project.dao.Project;

public class DisplayProjectResponse {

	private Project project;
	private float lowestBidAmount;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public float getLowestBidAmount() {
		return lowestBidAmount;
	}

	public void setLowestBidAmount(float lowestBidAmount) {
		this.lowestBidAmount = lowestBidAmount;
	}
}
