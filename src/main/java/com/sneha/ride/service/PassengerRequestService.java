package com.sneha.ride.service;


import com.sneha.ride.entities.PassengerRequests;
import com.sneha.ride.repository.PassengerRequestsRepository;
import com.sneha.ride.repository.UserRepository;
import com.sneha.ride.requests.PassengerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerRequestService {

    @Autowired
    private PassengerRequestsRepository passengerRequestsRepository;
    private UserRepository userRepository;

    public void addPassengerRequest(PassengerDTO passengerDTO){
        PassengerRequests passengerRequests = new PassengerRequests();

        passengerRequests= PassengerRequests.fromRequest(passengerDTO);

        passengerRequestsRepository.save(passengerRequests);
    }
}
