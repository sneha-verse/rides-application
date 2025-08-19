package com.sneha.ride.exceptionHandlers;

import com.sneha.ride.exceptions.UserAlreadyExists;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AllHandlers {

    @ExceptionHandler(UserAlreadyExists.class)
    private ResponseEntity<String> handleUserAlreadyExistsException (UserAlreadyExists ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

}
