package com.sneha.ride.entities;


import com.sneha.ride.requests.UserRequest;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    @NonNull
    private String email;
    private String password;
    private String phoneNumber;
    private Role role;
    private String license;
    private String vehicle;
    private String vehicleNo;

    @OneToMany (mappedBy = "userId")
    private List<PassengerRequests> passengerRequestsList;

    @OneToMany (mappedBy = "driver")
    private List<Rides> rides;

    public static User fromRequest(UserRequest request){
        User user= new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setRole(request.getRole());
        user.setLicense(request.getLicense());
        user.setVehicle(request.getVehicle());
        user.setVehicleNo(request.getVehicleNo());

        return user;
    }

    public enum Role{
        DRIVER,
        PASSENGER
    }


}
