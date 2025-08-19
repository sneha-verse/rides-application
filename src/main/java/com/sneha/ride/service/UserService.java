package com.sneha.ride.service;

import com.sneha.ride.entities.User;
import com.sneha.ride.exceptions.UserAlreadyExists;
import com.sneha.ride.repository.UserRepository;
import com.sneha.ride.requests.LoginRequest;
import com.sneha.ride.requests.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void addUser(UserRequest userRequest) {
        Optional<User> userExist = userRepository.findByEmail(userRequest.getEmail());
        if(userExist.isPresent()){
            throw new UserAlreadyExists("User Email " + userRequest.getEmail()+ " already in Use");
        }
        User user = User.fromRequest(userRequest);
        userRepository.save(user);
    }

    public void loginUser(LoginRequest loginRequest) {
        User user = userRepository.findByEmail(loginRequest.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (loginRequest.getPassword().equals(user.getPassword())) {
            System.out.println("Login successful for: " + user.getEmail());
        } else {
            throw new RuntimeException("Invalid password");
        }
        userRepository.save(user);
    }
}
