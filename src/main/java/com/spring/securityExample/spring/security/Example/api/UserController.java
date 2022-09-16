package com.spring.securityExample.spring.security.Example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getIndex")
    public String index(){
        return "index page";
    }
    @GetMapping("/getDashBoard")
    public String dashboard(){
        return "dashboard page";
    }
}
