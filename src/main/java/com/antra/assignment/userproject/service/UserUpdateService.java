package com.antra.assignment.userproject.service;

import com.antra.assignment.userproject.bean.UserEntity;
import com.antra.assignment.userproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserUpdateService {

    @Autowired
    @Lazy
    UserFindService userFindService;

    @Autowired
    UserRepository userRepository;


    public UserEntity updateUserById(Integer id, UserEntity user){
        userFindService.getUserById(id);
        user.setId(id);
        userRepository.saveAndFlush(user);
        return user;
    }
}
