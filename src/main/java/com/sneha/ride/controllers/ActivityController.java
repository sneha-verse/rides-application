package com.sneha.ride.controllers;


import com.sneha.ride.service.ActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @Autowired
    private ActivitiesService activitiesService;


}
