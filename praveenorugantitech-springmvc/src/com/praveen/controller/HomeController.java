package com.praveen.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@GetMapping("/")
	public String homeInit(Locale locale, Model model) {
		return "home";
	}

	@RequestMapping(value = "/returnHelloWorld", method = RequestMethod.GET)
	@ResponseBody
	public String returnHelloMethod() {
		return "Hello world!";
	}

}
