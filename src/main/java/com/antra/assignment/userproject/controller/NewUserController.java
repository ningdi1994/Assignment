package com.antra.assignment.userproject.controller;


import com.antra.assignment.userproject.bean.UserEntity;
import com.antra.assignment.userproject.service.UserCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewUserController {


    @Autowired
    UserCreateService userCreateService;

    @PostMapping("/users")
    public ResponseEntity creatUser(@RequestBody UserEntity user) {
        userCreateService.createUser(user);
        return new ResponseEntity(user, HttpStatus.CREATED);
    }


}
