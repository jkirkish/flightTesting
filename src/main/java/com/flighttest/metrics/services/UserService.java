package com.flighttest.metrics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flighttest.metrics.repository.UserRepository;



@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

}

