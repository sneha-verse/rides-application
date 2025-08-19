package com.sneha.ride.repository;


import com.sneha.ride.entities.PassengerRequests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRequestsRepository extends JpaRepository<PassengerRequests, Integer> {
}
