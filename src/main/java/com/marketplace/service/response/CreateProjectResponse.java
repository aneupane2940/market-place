package com.marketplace.service.response;

import com.marketplace.project.dao.Project;

public class CreateProjectResponse {

	private Project project;
	private int sellerId;
	private ProjectStatus status;
	private String message;

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

	public ProjectStatus getStatus() {
		return status;
	}

	public void setStatus(ProjectStatus status) {
		this.status = status;
	}

	public enum ProjectStatus {
		SUCCESS, FAIL
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
