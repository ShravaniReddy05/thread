package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.UserEntity;

@Repository
public interface UserRepository 
			extends CrudRepository<UserEntity, String> {

}
