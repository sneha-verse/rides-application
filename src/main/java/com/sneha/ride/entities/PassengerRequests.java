package com.sneha.ride.entities;


import com.sneha.ride.requests.PassengerDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity

@NoArgsConstructor
public class PassengerRequests {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private User userId;

    @ManyToOne
    private Rides rideId;

    private LocalDateTime startTime;
    private LocalDateTime dropTime;
    private LocalDateTime pickedUpTime;
    private LocalDateTime droppedTime;
    private Integer count;
    private String source;
    private String destination;
    private String confirmationStatus;
    private String rideStatus;
    private Integer amount;

    public static PassengerRequests fromRequest(PassengerDTO passengerDTO){
        PassengerRequests passengerRequests= new PassengerRequests();
        passengerRequests.setStartTime(passengerDTO.getStartTime());
        passengerRequests.setDropTime(passengerDTO.getDropTime());
        passengerRequests.setPickedUpTime(passengerDTO.getPickedUpTime());
        passengerRequests.setDroppedTime(passengerDTO.getDroppedTime());
        passengerRequests.setCount(passengerDTO.getCount());
        passengerRequests.setSource(passengerDTO.getSource());
        passengerRequests.setDestination(passengerDTO.getDestination());
        passengerRequests.setConfirmationStatus(passengerDTO.getConfirmationStatus());
        passengerRequests.setRideStatus(passengerDTO.getRideStatus());
        passengerRequests.setAmount(passengerDTO.getAmount());

        return passengerRequests;
    }

}
