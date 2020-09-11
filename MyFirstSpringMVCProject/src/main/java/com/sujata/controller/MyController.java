package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public ModelAndView myFirstController(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Hello everyone welcome to the world of Spring Boot MVC");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/second")
	public ModelAndView mySecondController(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Hello everyone welcome again to the world of Spring Boot MVC");
		mv.setViewName("index");
		return mv;
	}
}
