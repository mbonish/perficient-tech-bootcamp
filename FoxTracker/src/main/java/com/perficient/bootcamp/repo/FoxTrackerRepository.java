package com.perficient.bootcamp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perficient.bootcamp.entity.FoxTracker;

@Repository
public interface FoxTrackerRepository extends JpaRepository<FoxTracker, Integer> {

}
