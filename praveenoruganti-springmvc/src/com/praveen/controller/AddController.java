package com.praveen.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.praveen.aop.advice.TrackExecutionTime;

@Controller
public class AddController {

	@GetMapping("/index")
	@TrackExecutionTime
	public String homeInit(Locale locale, Model model) {
		return "index";
	}

	@RequestMapping(value = "/process", params = "add")
	@TrackExecutionTime
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int result = num1 + num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", result);
		return mv;
	}

	@RequestMapping(value = "/process", params = "duplicate")
	@TrackExecutionTime
	public @ResponseBody ModelAndView validateNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		ModelAndView mv = new ModelAndView();
		if (num1 == num2) {
			mv.setViewName("error");
		} else {
			int result = num1 + num2;
			mv.setViewName("display");
			mv.addObject("result", result);
		}
		return mv;
	}

}
