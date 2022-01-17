package com.perficient.bootcamp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perficient.bootcamp.entity.FoxTracker;
import com.perficient.bootcamp.repo.FoxTrackerRepository;

@Service
public class FoxTrackerService {

	@Autowired
	FoxTrackerRepository foxTrackerRepository;
	
	public List<FoxTracker> getAllFoxTrackers(){
		List<FoxTracker> foxTracker = foxTrackerRepository.findAll();
		return foxTracker;
	}
}
