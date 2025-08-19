package com.sneha.ride.requests;


import com.sneha.ride.entities.Rides;
import lombok.Data;

@Data
public class ActivitesRequest {

    private Rides ride;

    private String activity;
}
