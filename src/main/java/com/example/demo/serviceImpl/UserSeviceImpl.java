package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.UserService;
@Service
@Transactional
public class UserSeviceImpl implements UserService {

	 @Autowired
	    private UserRepository userRepository; 
	 
	@Override
	public List<User> getAllUser() {
		
		 return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		
		
		return userRepository.save(user);
	}

	@Override
	public void deleteById(String id) {
		
		User us=userRepository.findById(id).orElseThrow(()-> new RuntimeException ("user nor found"));
		userRepository.delete(us);
	
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(String id,User user) {
		// TODO Auto-generated method stub
	User us=userRepository.findById(id).orElseThrow(()-> new RuntimeException ("user nor found"));
	   
	    us.setName(user.getName());
	    us.setFirstName(user.getFirstName());
	    us.setLastName(user.getLastName());
	    us.setPhoneNumber(user.getPhoneNumber());
	    us.setAddress(user.getAddress());
	
		return userRepository.save(us);
}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return 	userRepository.findById(id).orElseThrow(()-> new RuntimeException ("user nor found"));

	}
}