package com.perficient.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perficient.bootcamp.entity.FoxTracker;
import com.perficient.bootcamp.service.FoxTrackerService;

@RestController
public class FoxTrackerController {
	
	@Autowired
	FoxTrackerService foxTrackerService;

	@RequestMapping("/allFoxTrackers")
	public List<FoxTracker> getTrackers(){
		return foxTrackerService.getAllFoxTrackers();
	}
}
