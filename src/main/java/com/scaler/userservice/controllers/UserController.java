package com.scaler.userservice.controllers;

import com.scaler.userservice.dtos.SignupRequestDto;
import com.scaler.userservice.models.User;
import com.scaler.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    private User login(){
        return null;
    }

    @PostMapping("/signup")
    private User signup(@RequestBody SignupRequestDto signupRequestDto){
        User user = userService.signup(signupRequestDto);

        return new ResponseEntity<>(user, HttpStatus.CREATED).getBody();
    }

    private ResponseEntity<Void> logout(){
        return null;
    }
}
