package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	 UserRepository userRepository;
	
	
	  public void addUser(User user)
	  {
		  userRepository.save(user);
	  }
	  
	  public void updateUser(User user)
	  {
		  userRepository.save(user);
	  }
	  
	  public void deleteUser(User user)
	  {
		  userRepository.delete(user);
	  }
	  public List<User> getAllUsers()
	  {
		
		  ArrayList<User> userlist=new ArrayList();
		  
		return   userRepository.findAll();
		  
		  
	  }
	  

}