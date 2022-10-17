package com.spring.securityExample.spring.security.Example.services;

import com.spring.securityExample.spring.security.Example.dtos.UserDto;
import org.springframework.http.ResponseEntity;

public interface IUserService {
    UserDto createUser(UserDto userDto);
}
