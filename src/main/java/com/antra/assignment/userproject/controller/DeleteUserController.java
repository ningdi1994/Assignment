package com.antra.assignment.userproject.controller;

import com.antra.assignment.userproject.service.UserDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteUserController {

    @Autowired
    UserDeleteService userDeleteService;

    @DeleteMapping("users/{id}")
    public ResponseEntity deleteUserById(@PathVariable("id") Integer id){
        userDeleteService.deleteUserById(id);
        return new ResponseEntity(HttpStatus.OK);

    }
}
