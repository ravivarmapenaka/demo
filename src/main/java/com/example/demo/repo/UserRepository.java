package com.example.demo.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.entity.User;

public interface UserRepository  extends MongoRepository < User, String  > {
	
	
	/*
	 * @Modifying
	 * 
	 * @Query("update User u set u.firstname = ?1, u.lastname = ?2 where u.id = ?3")
	 * void setUserInfoById(String firstname, String lastname, Integer userId);
	 */

}
