package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.UserEntity;


@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		
		return "add-edit-employee";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute UserEntity user, Model model) {
		System.out.println(user.toString());
		// validate 
		return "add-edit-employee";
		
	}
}
