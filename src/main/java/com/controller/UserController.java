package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exception.RecordNotFoundException;
import com.model.UserEntity;
import com.service.UserService;

@Controller
@RequestMapping("/")
public class UserController
{
	UserService service;


	@RequestMapping
	public String getAllUsers(Model model) 
	{	
		System.out.println("getAllUsers");
		
		List<UserEntity> list = service.getAllUsers();

		model.addAttribute("users", list);
		
		return "list-users";
	}

	
	
	
	@RequestMapping(path = {"/edit", "/edit/{id}"})
	public String editUserById(Model model, @PathVariable("id") Optional<String> id) 
							throws RecordNotFoundException 
	{
		
		System.out.println("editUserById" + id);
		if (id.isPresent()) {
			UserEntity entity = service.getUserById(id.get());
			model.addAttribute("user", entity);
		} else {
			model.addAttribute("user", new UserEntity());
		}
		
		
		return "add-edit-user";
	}
	
	@RequestMapping(path = "/delete/{id}")
	public String deleteUserById(Model model, @PathVariable("id") String id) 
							throws RecordNotFoundException 
	{
		
		System.out.println("deleteUserById" + id);
		
		service.deleteUserById(id);
		return "redirect:/";
	}

	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String createOrUpdate(UserEntity user) 
	{
		System.out.println("createOrUpdateUser");
		
		service.createOrUpdateUser(user);
		
		return "redirect:/";
	}
}
