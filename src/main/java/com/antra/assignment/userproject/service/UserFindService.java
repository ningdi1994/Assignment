package com.antra.assignment.userproject.service;

import com.antra.assignment.userproject.Exception.CustomException;
import com.antra.assignment.userproject.bean.UserEntity;
import com.antra.assignment.userproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserFindService {


    @Autowired
    UserRepository userRepository;


    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }



    public UserEntity getUserById(Integer id){
        Optional<UserEntity> opt = userRepository.findById(id);
        if(!opt.isPresent()){
            throw new CustomException("userNotFound");
        }
        return opt.get();
    }

    public Page<UserEntity> getPaginate(int page, int size, String sortBy){
        Sort sort = null;
        if(sortBy != null || sortBy.length() != 0){
            sort = new Sort(Sort.Direction.ASC, sortBy);
        }
        Page<UserEntity> res = userRepository.findAll(PageRequest.of(page, size, sort));

        return res;
    }
}
