package com.sneha.ride.requests;


import com.sneha.ride.entities.User;
import lombok.Data;

@Data
public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private User.Role role;
    private String license;
    private String vehicle;
    private String vehicleNo;
}
