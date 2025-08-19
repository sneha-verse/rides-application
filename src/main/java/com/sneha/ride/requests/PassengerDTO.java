package com.sneha.ride.requests;


import com.sneha.ride.entities.Rides;
import com.sneha.ride.entities.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data

public class PassengerDTO {

    private Integer userId;
    private Integer rideId;
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
}

