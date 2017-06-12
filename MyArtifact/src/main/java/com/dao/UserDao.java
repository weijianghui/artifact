package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public interface UserDao{  
    List<User> selectId(String username);  
}  