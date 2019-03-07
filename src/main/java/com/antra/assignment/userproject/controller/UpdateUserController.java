package com.antra.assignment.userproject.controller;

import com.antra.assignment.userproject.bean.UserEntity;
import com.antra.assignment.userproject.service.UserFindService;
import com.antra.assignment.userproject.service.UserUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateUserController {

    @Autowired
    UserUpdateService userUpdateService;
    @PutMapping("/users/{id}")
    public ResponseEntity<UserEntity> updateUserById(@PathVariable("id") Integer id, @RequestBody UserEntity user){
        return new ResponseEntity<>(userUpdateService.updateUserById(id,user), HttpStatus.OK);
    }
}
