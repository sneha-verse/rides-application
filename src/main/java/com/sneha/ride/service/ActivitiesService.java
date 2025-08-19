package com.sneha.ride.service;


import com.sneha.ride.entities.Activity;
import com.sneha.ride.repository.ActivitiesRepository;
import com.sneha.ride.requests.ActivitesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivitiesService {

    @Autowired
    private ActivitiesRepository activitiesRepository;


    public void addActivity(ActivitesRequest activitesRequest){
        Activity activity=new Activity();
        activity.setRide(activitesRequest.getRide());
        activity.setActivity(activitesRequest.getActivity());

        activitiesRepository.save(activity);

    }
}
