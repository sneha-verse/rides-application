package com.sneha.ride.controllers;


import com.sneha.ride.entities.User;
import com.sneha.ride.requests.LoginRequest;
import com.sneha.ride.requests.UserRequest;
import com.sneha.ride.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping ("/drivers/signup")
    public String signDriver (@RequestBody UserRequest userRequest){
        userRequest.setRole(User.Role.DRIVER);
        userService.addUser(userRequest);
        return "Driver sign up successfull";
    }

    @PostMapping ("/passengers/signup")
    public String signPassenger (@RequestBody UserRequest userRequest){
        userRequest.setRole(User.Role.PASSENGER);
        userService.addUser(userRequest);
        return "Passenger sign up successfull";
    }

    @PostMapping ("/drivers/login")
    public String loginDriver (@RequestBody LoginRequest loginRequest){
        userService.loginUser(loginRequest);
        return "Driver logged in Successfully";
    }

    @PostMapping ("/passengers/login")
    public String loginPassenger (@RequestBody LoginRequest loginRequest){
        userService.loginUser(loginRequest);
        return "Passenger logged in Successfully";
    }
}
