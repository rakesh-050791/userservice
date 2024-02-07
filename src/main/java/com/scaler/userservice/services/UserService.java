package com.scaler.userservice.services;

import com.scaler.userservice.dtos.SignupRequestDto;
import com.scaler.userservice.models.User;

public interface UserService {
    User signup(SignupRequestDto signupRequestDto);

    User login();

    Void logout();
}
