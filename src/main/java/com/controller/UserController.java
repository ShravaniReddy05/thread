package com.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.model.User;
import com.service.UserService;

@RestController
public class UserController {
	
@Autowired
UserService userService;

@PostMapping("/user")
public ResponseEntity<?> addUser(@RequestBody User user)
{
	userService.addUser(user);
	
	return new ResponseEntity("user added",HttpStatus.CREATED);
	
	
}

@GetMapping("/user")
public ResponseEntity<?> getAllUsers()
{
	List<User> userList=userService.getAllUsers();
	
	
	return new ResponseEntity<List<User>>(userList,HttpStatus.OK);
}


@PatchMapping("/user")
public ResponseEntity<?> updateItem(@RequestBody User user)
{

	
	userService.updateUser(user);
	return new ResponseEntity("User updated successfully",HttpStatus.ACCEPTED);
			
}

@DeleteMapping("/user")
public ResponseEntity<?> deleteUser(@RequestBody User user)
{
	userService.deleteUser(user);
	return new ResponseEntity("User deleted successfully",HttpStatus.OK);
}



}