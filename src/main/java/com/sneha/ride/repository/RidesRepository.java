package com.sneha.ride.repository;

import com.sneha.ride.entities.Rides;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RidesRepository extends JpaRepository<Rides, Integer> {
}
