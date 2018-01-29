package com.marketplace.service.request;

import com.marketplace.project.dao.Project;

public class CreateProjectRequest {

	private Project project;
	private int sellerId;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
}
