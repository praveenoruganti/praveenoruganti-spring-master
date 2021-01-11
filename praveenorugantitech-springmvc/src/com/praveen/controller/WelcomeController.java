package com.praveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
@RequestMapping(value = "/", method = RequestMethod.GET)
public String welcome(Model model){
model.addAttribute("message", "Hello Spring MVC Framework!");
return "welcome-page";
}
}

