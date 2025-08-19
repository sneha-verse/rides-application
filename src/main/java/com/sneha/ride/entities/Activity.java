package com.sneha.ride.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Rides ride;

    private String activity;
}
