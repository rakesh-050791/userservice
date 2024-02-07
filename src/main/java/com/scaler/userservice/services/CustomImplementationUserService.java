package com.scaler.userservice.services;

import com.scaler.userservice.dtos.SignupRequestDto;
import com.scaler.userservice.models.User;
import com.scaler.userservice.repositories.RoleRepository;
import com.scaler.userservice.repositories.TokenRepository;
import com.scaler.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CustomImplementationUserService")
public class CustomImplementationUserService implements UserService{

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final TokenRepository tokenRepository;

    @Autowired
    public CustomImplementationUserService(UserRepository userRepository,
                                           RoleRepository roleRepository,
                                           TokenRepository tokenRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.tokenRepository = tokenRepository;
    }

    @Override
    public User signup(SignupRequestDto signupRequestDto){
        User newUser = new User();
        newUser.setEmail(signupRequestDto.getEmail());
        newUser.setHashedPassword(signupRequestDto.getPassword());
        newUser.setName(signupRequestDto.getName());

        return userRepository.save(newUser);
    }

    public User login(){
        return null;
    }

    public Void logout(){
        return null;
    }
}
