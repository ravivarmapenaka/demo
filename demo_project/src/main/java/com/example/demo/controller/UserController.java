package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	 @Autowired
	    private UserService userService;
	
	@GetMapping("/users")
    public ResponseEntity< ?> getAllUsers() {
        return ResponseEntity.ok().body(userService.getAllUser());
    }
	
	
	@GetMapping("/users/{id}")
    public ResponseEntity< ?> getUser(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(userService.getUser(id));
    }

    @PostMapping("/addUser")
    public  ResponseEntity< ?> createUser( @RequestBody User user){
    
        
    return    ResponseEntity.ok().body(userService.save(user));
}
    
    @PutMapping("/updateUser/{id}")
    public  ResponseEntity< ?> UpdateUser(@PathVariable("id") String id,@RequestBody User user){
    	
    return ResponseEntity.ok().body(userService.update(id,user));
    
    }	
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity< ?> deleteUser(@PathVariable String id){
    	userService.deleteById(id);       
    	return ResponseEntity.ok().body("Deleted Successfully") ;
   }
 
    
}