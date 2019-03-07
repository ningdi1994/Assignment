package com.antra.assignment.userproject.repository;

import com.antra.assignment.userproject.bean.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {


}
