package com.antra.assignment.userproject.controller;


import com.antra.assignment.userproject.bean.UserEntity;
import com.antra.assignment.userproject.service.UserCreateService;
import com.antra.assignment.userproject.service.UserFindService;
import com.antra.assignment.userproject.service.UserUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FindUserController {


    UserFindService userFindService;

    @Autowired
    public FindUserController(UserFindService userFindService){
        this.userFindService = userFindService;
    }

//    @GetMapping("/users")
//    public ResponseEntity<List<UserEntity>> getAllUsers(){
//        return new ResponseEntity<List<UserEntity>>(userFindService.getAllUsers(),HttpStatus.OK);
//    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable("id") Integer id){
        return new ResponseEntity(userFindService.getUserById(id),HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<Page<UserEntity>> getPaginatedUsers(@RequestParam(name = "pageNo", defaultValue = "0") Integer pageNo,
                                                                @RequestParam(name = "rows", defaultValue = "5") Integer row,
                                                              @RequestParam(name="orderBy",defaultValue = "id") String orderBy){

        return new ResponseEntity<>(userFindService.getPaginate(pageNo, row, orderBy),HttpStatus.OK);

    }
}
