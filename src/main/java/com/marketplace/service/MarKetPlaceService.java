package com.marketplace.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.service.request.CreateProjectRequest;
import com.marketplace.service.request.ProjectBidRequest;
import com.marketplace.service.response.CreateProjectResponse;
import com.marketplace.service.response.ProjectBidResponse;

@RestController
@RequestMapping("market-place")
public class MarKetPlaceService {

	@RequestMapping(path = "/{bid}", method = RequestMethod.POST, produces = "application/json")
	public ProjectBidResponse submitBid(@RequestBody ProjectBidRequest bidrequest) {

		return null;
	}

	@RequestMapping(path = "/{submit}", method = RequestMethod.POST, produces = "application/json")
	public CreateProjectResponse createProject(@RequestBody CreateProjectRequest request) {

		return null;
	}

}