package com.praveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praveen.aop.advice.TrackExecutionTime;
import com.praveen.bean.User;
import com.praveen.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping
	@RequestMapping("/getUser")
	@TrackExecutionTime
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@PostMapping(value ="/createUser", consumes = MediaType.APPLICATION_JSON_VALUE,
	        produces = MediaType.APPLICATION_JSON_VALUE)
	@TrackExecutionTime
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	
}
