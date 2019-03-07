package com.antra.assignment.userproject.service;

import com.antra.assignment.userproject.bean.UserEntity;
import com.antra.assignment.userproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserCreateService {

    @Autowired
    UserRepository userRepository;
    public void createUser(UserEntity user){
        userRepository.save(user);
    }
}
