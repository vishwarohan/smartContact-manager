package com.smart.smartContactManager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.smartContactManager.entities.User;

@Repository
public interface UserRepository extends JpaRepository <User, Integer>{

}
