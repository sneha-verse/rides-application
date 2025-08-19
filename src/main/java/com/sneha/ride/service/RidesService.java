package com.sneha.ride.service;


import com.sneha.ride.entities.Rides;
import com.sneha.ride.repository.RidesRepository;
import com.sneha.ride.requests.RidesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RidesService {

    @Autowired
    private RidesRepository ridesRepository;

    public void addRide(RidesRequest ridesRequest){
        Rides ride=new Rides();

        ride.setId(ridesRequest.getDriver());
        ride.setStatus(ridesRequest.getStatus());

        ridesRepository.save(ride);
    }


}
