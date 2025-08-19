package com.sneha.ride.repository;

import com.sneha.ride.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivitiesRepository extends JpaRepository<Activity, Integer> {
}
