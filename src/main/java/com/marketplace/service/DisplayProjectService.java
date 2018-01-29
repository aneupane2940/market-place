package com.marketplace.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.project.dao.Project;
import com.marketplace.service.response.DisplayProjectResponse;

@RestController
@RequestMapping("show")
public class DisplayProjectService {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public DisplayProjectResponse displayProject(@PathVariable String id) {
		DisplayProjectResponse d = new DisplayProjectResponse();
		d.setLowestBidAmount(1.00f);
		Project project = new Project();
		project.setId(1);
		project.setMaxBudget(200);
		d.setProject(project);
		return d;
	}

	@RequestMapping(path = "/all", produces = "application/json")
	public Set<DisplayProjectResponse> displayOpenProjects() {

		Set<DisplayProjectResponse> allProjects = new HashSet<DisplayProjectResponse>();
		DisplayProjectResponse d = new DisplayProjectResponse();
		d.setLowestBidAmount(1.00f);
		Project project = new Project();
		project.setId(1);
		project.setMaxBudget(200);
		d.setProject(project);
		allProjects.add(d);

		DisplayProjectResponse d1 = new DisplayProjectResponse();
		d1.setLowestBidAmount(1.00f);
		Project project1 = new Project();
		project1.setId(2);
		project1.setMaxBudget(200);
		d1.setProject(project1);

		allProjects.add(d1);
		return allProjects;
	}
}