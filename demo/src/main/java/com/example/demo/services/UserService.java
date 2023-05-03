package com.example.demo.services;

import com.example.demo.dtos.UserLoginDto;
import com.example.demo.dtos.UserRegisterDto;
import com.example.demo.model.entities.User;
import com.example.demo.model.entities.helpers.LoggedUser;
import com.example.demo.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final LoggedUser loggedUser;

    @Autowired
    public UserService(UserRepository userRepository, ModelMapper modelMapper, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.loggedUser = loggedUser;
    }

    public void registerUser(UserRegisterDto userRegisterDto) {
        this.userRepository.saveAndFlush(this.modelMapper.map(userRegisterDto, User.class));
    }
    public void loginUser(UserLoginDto userLoginDto) {

        User byEmail = this.userRepository.findByEmail(userLoginDto.getEmail()).get();

        this.loggedUser.setId(byEmail.getId());
    }
    public void logoutUser() {
        loggedUser.clearUser();
    }
}
