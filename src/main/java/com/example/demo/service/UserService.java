package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {

	 List< User > getAllUser();

	 User save(User user);

	void deleteById(String id);

	User addUser(User user);

	User update(String id,User user);

	User getUser(String id);
}
