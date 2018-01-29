package com.marketplace.project.dao;

import java.util.Date;

public class Project {

	private int Id;
	private String name;
	private String description;
	private Date lastDay;
	private float maxBudget;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getLastDay() {
		return lastDay;
	}

	public void setLastDay(Date lastDay) {
		this.lastDay = lastDay;
	}

	public float getMaxBudget() {
		return maxBudget;
	}

	public void setMaxBudget(float maxBudget) {
		this.maxBudget = maxBudget;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
