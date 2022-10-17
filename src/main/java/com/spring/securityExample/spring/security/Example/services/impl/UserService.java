package com.spring.securityExample.spring.security.Example.services.impl;

import com.spring.securityExample.spring.security.Example.dtos.UserDto;
import com.spring.securityExample.spring.security.Example.entities.User;
import com.spring.securityExample.spring.security.Example.repositories.UserRepository;
import com.spring.securityExample.spring.security.Example.services.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    public UserService(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user=modelMapper.map(userDto,User.class);
        return modelMapper.map(userRepository.save(user),UserDto.class);

    }
}
