package com.sneha.ride.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Rides {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private User driver;

    private String status;

    @OneToMany (mappedBy = "rideId")
    private List<PassengerRequests> passengerRequestsList;

    @OneToMany (mappedBy = "ride")
    private List<Activity> activitiesList;

}
