package com.springBoot.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springBoot.jsp.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService service;

	@RequestMapping("/")
	public String home() {
		System.out.println("jai shree ram");
		return "Home";
	}

	@RequestMapping("/registerUser")
	public String about() {
		String saveUser = service.saveUser();
		System.out.println(saveUser);
		Model model = (Model) new ModelAndView();
		return "about";
	}

}
