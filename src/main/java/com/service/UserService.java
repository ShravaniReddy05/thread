package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.RecordNotFoundException;
import com.model.UserEntity;
import com.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public List<UserEntity> getAllUsers()
	{
		System.out.println("getAllUsers");
		List<UserEntity> result = (List<UserEntity>) repository.findAll();
		
		if(result.size() > 0) {
			return result;
		} else {
			return new ArrayList<UserEntity>();
		}
	}

	
	public UserEntity getUserById(String id) throws RecordNotFoundException 
	{
		System.out.println("getUserById");
		Optional<UserEntity> user = repository.findById(id);
		
		if(user.isPresent()) {
			return user.get();
		} else {
			throw new RecordNotFoundException("No user record exist for given id");
		}
	}
	
	public UserEntity createOrUpdateUser(UserEntity entity) 
	{
		System.out.println("createOrUpdateUser");
		// Create new entry 
		if(entity.getUserId()  == null) 
		{
			entity = repository.save(entity);
			
			return entity;
		} 
		else 
		{
			// update existing entry 
			Optional<UserEntity> user = repository.findById(entity.getUserId());
			
			if(user.isPresent()) 
			{
				UserEntity newEntity = user.get();
				newEntity.setUserName(entity.getUserName());
				newEntity.setEmail(entity.getEmail());
				newEntity.setRole(entity.getRole());

				newEntity = repository.save(newEntity);
				
				return newEntity;
			} else {
				entity = repository.save(entity);
				
				return entity;
			}
		}
	} 
	
	public void deleteUserById(String id) throws RecordNotFoundException 
	{
		System.out.println("deleteUserById");
		
		Optional<UserEntity> user = repository.findById(id);
		
		if(user.isPresent()) 
		{
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No user record exist for given id");
		}
	} 
}