package com.sujata.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.User;
import com.sujata.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView mainPage(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("user",new User());
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView checkCtrl(@ModelAttribute("user") User user){
		ModelAndView mv=new ModelAndView();
		
		String message;
		if(userService.loginCheck(user))
			message="Login Successful !";
		else
			message="Login Failed !";
		mv.addObject("status",message);
		mv.setViewName("result");
		return mv;
	}
//	@RequestMapping("/login")
//	public ModelAndView checkCtrl(HttpServletRequest request){
//		ModelAndView mv=new ModelAndView();
//		String username=request.getParameter("uname");
//		String password=request.getParameter("pwd");
//		User user=new User(username, password);
//		String message;
//		if(userService.loginCheck(user))
//			message="Login Successful !";
//		else
//			message="Login Failed !";
//		mv.addObject("status",message);
//		mv.setViewName("result");
//		return mv;
//	}
}
