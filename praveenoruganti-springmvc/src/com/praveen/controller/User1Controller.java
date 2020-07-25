package com.praveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praveen.bean.User1;

@Controller
public class User1Controller {
	@RequestMapping("/user1")
	public String newUser(Model model) {
		model.addAttribute("user1", new User1());
		return "user1Form";
	}

	@RequestMapping(value = "/addUser1", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user1") User1 user) {
		return "result";
	}
}
