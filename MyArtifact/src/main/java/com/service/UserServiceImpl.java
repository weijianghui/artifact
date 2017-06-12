package com.service;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	 @Resource
	private UserDao userDao; 

	public boolean doUserLogin(User user) {
		List<User> list = userDao.selectId(user.getUsername());  
        if(list.size() == 0){  
            return false;  
        }else{  
            if(list.get(0).getPassword().equals(user.getPassword())){                 
                return true;  
            }else{  
                return false;  
            }             
        }  
	}

}
