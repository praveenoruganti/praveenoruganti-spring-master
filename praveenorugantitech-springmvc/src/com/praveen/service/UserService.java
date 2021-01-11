package com.praveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.bean.User;
import com.praveen.dao.UserDAO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDao;
	
    public List<User> getUsers() {
        return userDao.getAllUsers();
    }
   
	public User createUser(User user) {
		return userDao.createUser(user);
	}
}
