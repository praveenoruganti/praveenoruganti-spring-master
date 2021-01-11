package com.praveen.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.praveen.bean.User;

@Repository
public class UserDAO {

	private List<User> userList;

	public UserDAO() {
		userList = new ArrayList<User>();
	}

	public List<User> getAllUsers() {
		return userList;
	}

	public User createUser(User user) {
		userList.add(user);
		return user;

	}

}
