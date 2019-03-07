package com.antra.assignment.userproject.service;


import com.antra.assignment.userproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDeleteService {
    @Autowired
    UserFindService userFindService;
    @Autowired
    UserRepository userRepository;

    public void deleteUserById(Integer id){
        userFindService.getUserById(id);
        userRepository.deleteById(id);

    }

}
