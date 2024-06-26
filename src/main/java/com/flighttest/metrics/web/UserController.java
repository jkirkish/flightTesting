package com.flighttest.metrics.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.flighttest.metrics.services.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("")
    public String getLogin(){

        return "Login";

    }

}
