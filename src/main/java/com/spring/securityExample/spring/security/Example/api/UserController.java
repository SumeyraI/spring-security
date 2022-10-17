package com.spring.securityExample.spring.security.Example.api;

import com.spring.securityExample.spring.security.Example.dtos.UserDto;
import com.spring.securityExample.spring.security.Example.services.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @GetMapping("/getIndex")
    public String index(){
        return "index page";
    }
    @GetMapping("/getDashBoard")
    public String dashboard(){
        return "dashboard page";
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        return ResponseEntity.ok(iUserService.createUser(userDto));
    }
}
